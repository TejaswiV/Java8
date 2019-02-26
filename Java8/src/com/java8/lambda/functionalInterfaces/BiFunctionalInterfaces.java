package com.java8.lambda.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

/*
 * BiPredicate, BiFunction, BiConsumer accept two input arguments
 * 
 */
public class BiFunctionalInterfaces {

	public static void main(String[] args) {
		
		
		// Check if the sum of the given two numbers is even or not
		BiPredicate<Integer, Integer> p = (a,b) -> (a+b)%2 == 0;
		System.out.println(p.test(3, 4));
		
		//Return product of two numbers with BiFunction
		BiFunction<Integer, Integer, Integer> f = (a, b) -> (a * b);
		System.out.println(f.apply(3, 4));
		
		// BiConsumer
		BiConsumer<String, String> c = (s1,s2) -> System.out.println(s1.concat(s2));
		c.accept("Java 8 ", "Features");
		
		//Increment employee salary with BiFunction and BiConsumer
		List<Employee> list = new ArrayList<Employee>();
		BiFunction<Integer, Double, Employee> f2 = (id, salary) -> new Employee(id, salary);
		list.add(f2.apply(1, 1000d));
		list.add(f2.apply(2, 2500d));
		
		BiConsumer<Employee, Double> c2 = (emp, increment) -> emp.setSalary( emp.getSalary() + increment);
		
		for (Employee emp : list) {
			c2.accept(emp, 200d);
			System.out.println(emp);
		}
		
		
		
	}

}
