package com.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

import com.java8.streams.helper.Employee;

public class MapFilterReduce {

	public static void main(String[] args) {
		
		List<Employee> list  = Arrays.asList(						
				new Employee(1, "David", 1200.0),
				new Employee(2, "Peter", 2000.0),
				new Employee(3, "Mark", 3200.0),
				new Employee(4, "Max", 1000.0),
				new Employee(5, "Dan", 5000.0),
				new Employee(6, "Sam", 4200.0));
		
		OptionalDouble avg= list.stream()
				.mapToDouble(Employee::getSalary)
				.filter(s -> s > 3200)
				.average();
		System.out.println(avg.isPresent() ? avg.getAsDouble() : "Empty Optional!");
		
		OptionalDouble min =list.stream()
			.mapToDouble(Employee::getSalary)
			.min();
		System.out.println(min.isPresent() ? min.getAsDouble() : "Empty Optional!");
		
		double sum =list.stream()
				.mapToDouble(Employee::getSalary)
				.sum();
			System.out.println(sum);
			
		// Custom reduce()
		
		OptionalDouble minr = list.stream()
								.mapToDouble(Employee::getSalary)
								.reduce((s1, s2) -> s1 > s2 ? s2 : s1);
		minr.ifPresent(System.out::println);
		
		double minr2 = list.stream()
				.mapToDouble(Employee::getSalary)
				.reduce(Double.MAX_VALUE, (s1, s2) -> s1 < s2 ? s1 : s2);
		System.out.println("min with reduce() " +minr2);
		
		// Stream max(), min(), reduce()
		
		Optional<Employee> max = list.stream()
			.max((e1,e2) -> e1.getSalary() > e2.getSalary()? 1 :(e1.getSalary() < e2.getSalary())? -1 : 0);
			
		System.out.println( max.isPresent()? max.get(): "Stream max() - Empty Optional<Employee>");
		
		// Stream findFirst()
		
		System.out.println("findFirst() of Stream "+list.stream()
			.sorted((e1,e2) -> e1.getSalary() > e2.getSalary()? 1 :(e1.getSalary() < e2.getSalary())? -1 : 0)
			.findFirst().get());
		
		
	
	}

}
