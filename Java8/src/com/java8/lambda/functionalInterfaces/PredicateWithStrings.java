package com.java8.lambda.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateWithStrings {

	public static void main(String[] args) {
		
		String[] names = {"Teju", "Kondal", "Chinnodu", "Chinni", "Vijaya", "Keerthan"};
		
		// Find names starting with 'C'
		Predicate<String> p = s -> s.charAt(0) == 'C';
		for (String s : names) {
			if(p.test(s)) {
				System.out.print(s+" ");
			}
		}
		System.out.println();
		
		// Remove null values and empty strings from a given list
		String[] list = {"Teju", "", "Kondal", "Chinnodu", "", "Vijaya", "Keerthan", null};
		Predicate<String> p1 = s ->  s != null && s.length() > 0;
		List<String>  l = new ArrayList<String>();
		
		for (String s : list) {
			if(p1.test(s)) {
				l.add(s);
			}
		}		
		System.out.println(l);

	}

}
