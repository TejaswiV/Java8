package com.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.java8.streams.helper.Employee;

public class SortingWithStreams {

	public static void main(String[] args) {

		List<Employee> list  = Arrays.asList(						
				new Employee(1, "David", 1200.0),
				new Employee(2, "Peter", 2000.0),
				new Employee(3, "Mark", 3200.0),
				new Employee(4, "Max", 1000.0),
				new Employee(5, "Dan", 5000.0),
				new Employee(6, "Sam", 4200.0));
		
		list.stream()
			.map(Employee::getName)
			.sorted()
			.forEach(System.out::println);
		
		list.stream()
		.sorted(Comparator.comparing(Employee::getSalary).reversed())
		.forEach(System.out::println);
		
		list.stream()
		.sorted(Comparator.comparing(Employee::getName).thenComparing(Comparator.comparing(Employee::getSalary)))
		.forEach(System.out::println);
	}

}
