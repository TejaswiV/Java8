package com.java8.lambda.functionalInterfaces;

import java.util.function.Function;

/*
 * f1.apply(f2) -  apply f1 first and then f2
 * f1.compose(f2) -  apply f2 and then f1
 */
public class FunctionChaining {

	public static void main(String[] args) {
		
		String str = "StringForFunctions";
		
		Function<String, String> f1 = s -> s.toUpperCase();
		Function<String, String> f2 = s -> s.substring(0, 9);
		
		System.out.println(f1.apply(str));
		System.out.println(f2.apply(str));
		System.out.println(f1.andThen(f2).apply(str));		
		System.out.println(f1.compose(f2).apply(str));
		
		Function<Integer, Integer> f3 = i -> i+i;
		Function<Integer, Integer> f4 = i -> i * i;
		
		System.out.println(f3.andThen(f4).apply(3));
		System.out.println(f4.andThen(f3).apply(3));		
		System.out.println(f3.compose(f4).apply(3));
		System.out.println(f4.compose(f3).apply(3));
		
	}

}
