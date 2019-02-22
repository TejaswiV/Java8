package com.java8.lambda;

/*
 * This in Lambda always refers to the enclosing class's context. 
 * variable declared inside lambda are local to lambda function. These are method local variable and reside inside method area
 * Not possible to have instance variable inside lambda expressions
 *  
 */


public class ThisInLambda {
	
	int x = 5;
	public static void main(String[] args) {
		
		ThisInLambda l = new ThisInLambda();
		l.method2();

	}
	
	public void method2() {		
		int y = 10;
		InterfaceThis i1 = () -> {
			int x = 2;
			System.out.println(y);
			System.out.println("x value from Lambda function "+x);
			System.out.println("x value from the enclosed class "+this.x);			
		};
		
		i1.method1();		
	}

}

interface InterfaceThis{
	public void method1();
}
