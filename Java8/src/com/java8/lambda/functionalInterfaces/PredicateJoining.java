package com.java8.lambda.functionalInterfaces;

import java.util.function.Predicate;

/*
 * negate(), and(), or() are default methods in Predicate interface
 */

public class PredicateJoining {

	public static void main(String[] args) {
		
		int[] x = {12, 14, 3, 5, 7, 34, 54, 90, 11, 4, 8, 25};
		
		Predicate<Integer> p1 = i -> i > 10;
		Predicate<Integer> p2 = i -> i % 2 == 0;
		
		System.out.print("Numbers greater than 10 are ");
		m1(x, p1);
		
		System.out.print("Even numbers are ");
		m1(x, p2);
		
		System.out.print("Number greater than 10 and even numbers are ");
		m1(x, p1.and(p2));
		
		System.out.print("Odd numbers are ");
		m1(x, p2.negate());
		
		System.out.print("Numbers greater than 10 or even numbers are ");
		m1(x, p1.or(p2));
		
	}
	
	public static void m1(int[] x, Predicate<Integer> p) {
		for (int i : x) {
			if(p.test(i)) {
				System.out.print(i +" ");
			}
		}
		System.out.println();
		
	}

}
