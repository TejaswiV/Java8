package com.java8.lambda.functionalInterfaces;

import java.util.function.Function;

public class FunctionEx {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f1 = i -> i*i;
		System.out.println(f1.apply(4));
		
		Function<String, Integer> f2 = s -> s.length();
		System.out.println(f2.apply("Tejaswi"));
		
		// Remove spaces present in the string
		String str = "This is a test string";
		Function<String, String> f3 = s -> s.replace(" ", "");
		System.out.println(f3.apply(str));

		// Count number of spaces in a given string
		Function<String, Integer> f4 = s -> s.length() - s.replace(" ", "").length();
		System.out.println(f4.apply(str));
		
		
	}

}
