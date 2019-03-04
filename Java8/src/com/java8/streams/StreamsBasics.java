package com.java8.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class StreamsBasics {

	public static void main(String[] args) {
		
		// Stream from Array 
		Integer[] nums = {1,2,3,4};
		Stream<Integer> stream = Arrays.stream(nums);
		long count = stream.filter(i -> i > 2).count();
		System.out.println("No of elements greater than 2 are "+count);
		
		// Stream from List
		List<String> list = Arrays.asList("David","Peter","George","Messi","Mark");
		list.stream()
			.filter(s -> s.startsWith("D") || s.startsWith("P") || s.startsWith("M"))
			.filter(s -> s.length() > 4)
			.forEach(System.out::println);
		
		// Primitive streams
		DoubleStream ds = DoubleStream.of(223,672.0,67.5,22,90,567.8);
		System.out.println("Size of DoubleStream :: "+ds.count());
		
		// Stream using of()
		Stream<Integer> s = Stream.of(1,2,3);
		System.out.println("Size of Stream created using Stream.of() "+s.count());
		
		// Stream with Map
		// Can't create stream with stream() of Collection interface because Map doesn't implement Collection interface
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("David", 20);
		map.put("Peter", 23);
		map.put("George", 2);
		map.put("Messi", 17);
		map.put("Mark", 26);
		System.out.println("People with age greater than 20 are ");
		map.entrySet()
			.stream()
			.filter(es -> es.getValue() > 20)
			.forEach(es -> System.out.println(es.getKey()));
		
		
		
		

	}

}
