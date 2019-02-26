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
		
		//Create employee object with BiFunction
		List<Employee> list = new ArrayList<Employee>();
		BiFunction<Integer, String, Employee> f2 = (id, name) -> new Employee(id, name);
		list.add(f2.apply(1, "David"));
		list.add(f2.apply(2, "Hazelwood"));
		for (Employee emp : list) {
			System.out.println(emp);
		}
		
		// BiConsumer
		BiConsumer<String, String> c = (s1,s2) -> System.out.println(s1.concat(s2));
		c.accept("Java 8 ", "Features");
		
	}

}


class Employee {
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "id: "+id+" Name: "+name;
	}
	
}
