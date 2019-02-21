package com.java8.lambda;

public class ThreadWithLambda {

	public static void main(String[] args) {

		Runnable r = () -> {
			for (int i = 0; i < 3; i++) {
				System.out.println("In thread " + i);
			}
		};

		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i < 3; i++) {
			System.out.println("In main");
		}

	}

}
