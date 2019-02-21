package com.java8.lambda;

import com.java8.lambda.interfaces.Addition;
import com.java8.lambda.interfaces.Interface1;

public class LambdaBasics1 {

	public static void main(String[] args) {

		Interface1 i1 = () -> System.out.println("Method 1 Implementation using Lambda");
		i1.method1();
		
		Addition add = (a, b) -> a+b;
		System.out.println("Addition with lambda "+add.add(5, 6));
	}

}
