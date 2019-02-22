package com.java8.lambda.functionalInterfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {

		Predicate<Integer> p = i -> i > 10; 
		System.out.println(p.test(12));
		System.out.println(p.test(3));

		//Check if a string is of length more than 6 characters
		Predicate<String> p2 = s -> s.length() > 6;
		System.out.println(p2.test("Test String"));
		
		// Check if a collection is empty or not
		Predicate<Collection<Integer>> p3 = c -> c.size() == 0;
		System.out.println(p3.test(new ArrayList<Integer>()));
		
		
	}

}
