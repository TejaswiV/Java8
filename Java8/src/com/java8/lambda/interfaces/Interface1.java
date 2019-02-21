package com.java8.lambda.interfaces;

/*
 * Functional interface should contain one abstract method
 * Can have any number of default and static methods
 */

@FunctionalInterface
public interface Interface1 {

	public void method1();

	default void method2() {

	}

	static void method3() {

	}
}

/*
 * Abstract method is inherited from parent and it cannot contain any additional abstract methods
 */

@FunctionalInterface
interface Interface2 extends Interface1{
	
	default void mrthod5() {
		
	}
	static void method6() {

	}
}

/*
 * Valid but This is not a functional interface as it has more than one abstract methods (inherited one abstract method and one declared here)
 */

interface Interface3 extends Interface1{
	public void method4();
}

// Can declare the method defined in parent again in child and child interface still a Functional interface

@FunctionalInterface
interface Interface4 extends Interface1{
	
	public void method1();
}






