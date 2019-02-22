package com.java8.lambda;

import com.java8.lambda.interfaces.Addition;
import com.java8.lambda.interfaces.Interface1;

public class LambdaBasics1 {

	public static void main(String[] args) {

		Interface1 i1 = () -> System.out.println("Method 1 Implementation using Lambda");
		i1.abstractMethod();
		
		Addition add = (a, b) -> a+b;
		System.out.println("Addition with lambda "+add.add(5, 6));
		
		//Accessing interface's static method
		Interface1.staticMethod();
		
		
		// accessing default methods of interface
		Lambda2 l = new Lambda2();
		l.defaultMethod();
		l.method1();
				
	}

}

class Lambda2 implements Interface1{

	public void method1() {
		Interface1.super.defaultMethod(); // calling interface's default method
	}
	
	public void defaultMethod() {
		System.out.println("In overriden default method");
	}

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		
	}
	
	 
}
