package com.java8.lambda;

public class LambdaBasics2 {

	public static void main(String[] args) {
		
		String str = "LambdaExpressions";
		Length l = s -> s.length();
		
		System.out.println(l.length(str));
		
		Square sq =  x -> x*x;
		System.out.println(sq.sqaureIt(4));

	}

}

interface Length{
	public int length(String s);
}

interface Square{
	public int sqaureIt(int x);
}