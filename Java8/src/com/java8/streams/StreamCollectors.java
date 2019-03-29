package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.streams.helper.Employee;

public class StreamCollectors {

	public static void main(String[] args) {

		List<Employee> list  = Arrays.asList(						
				new Employee(1, "David", 1200.0),
				new Employee(2, "Peter", 2000.0),
				new Employee(3, "Mark", 3200.0),
				new Employee(4, "Max", 1000.0),
				new Employee(5, "Dan", 5000.0),
				new Employee(6, "Sam", 4200.0),
				new Employee(7, "Dan", 8000.0));
		
		List<Employee> list2 = list.stream()
			.filter(e -> e.getSalary() > 3000)
			.collect(Collectors.toList());
		System.out.println(list2);
		
		list.stream()
		.filter(e -> e.getSalary() > 3000)
		.collect(Collectors.toSet()).forEach(System.out::print);
		
		
		
	}

}
