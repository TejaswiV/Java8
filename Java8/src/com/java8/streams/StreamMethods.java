package com.java8.streams;

import java.util.stream.IntStream;

public class StreamMethods {

	public static void main(String[] args) {
		
		IntStream stream = IntStream.range(10, 15);
		stream.forEach(i -> System.out.print(i+" "));		
		System.out.println();
		
		IntStream.rangeClosed(10, 15).forEach(i -> System.out.print(i+" "));		
		System.out.println();
		
		IntStream.rangeClosed(0, 20)
				.filter(i -> i % 2 == 0)
				.limit(5).forEach(i -> System.out.print(i+" "));
		System.out.println();
		
		IntStream.rangeClosed(0, 20)
				.filter(i -> i % 2 == 0)
				.skip(5).forEach(i -> System.out.print(i+" "));
		System.out.println();
		
		IntStream.rangeClosed(0, 20)
				.filter(i -> i % 2 == 0)
				.skip(10).forEach(i -> System.out.print(i+" "));
		
	}

}
