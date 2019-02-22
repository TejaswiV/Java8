package com.java8.lambda;

public class LambdaClosure {

	public static void main(String[] args) {
		LambdaClosure l = new LambdaClosure();
		l.method2();

	}
	
	/*
	 * Local variable referred inside lambda expression are implicitly final  
	 * We can't change the value of 'y' inside or outside of lambda expression
	 * If it is not used inside lambda then its not final, we can change its value outside lambda  
	 */
	
	public void method2() {		
		int y = 10;
		InterfaceThis i1 = () -> {
			System.out.println(y);
			//y = 5;  // compiler error
						
		};
		
		//y = 20; // compiler error
		
		i1.method1();		
	}

}
