package com.java8.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class StreamOfStreams {

	public static void main(String[] args) {

		try {
			/* Stream<String> stream =Files.lines(Paths.get("src/com/java8/streams/helper/textFile.txt"));
			Stream<String[]> arrayStream = stream.map(line -> line.split(" "));
			//arrayStream.map(array -> Arrays.stream(array)).forEach(System.out::println);
			long count = arrayStream
						.flatMap(array -> Arrays.stream(array))
						.filter(word -> word.equalsIgnoreCase("Java"))
						.count(); */
			
			
			long count = Files.lines(Paths.get("src/com/java8/streams/helper/textFile.txt"))
							.map(line -> line.split(" "))
							.flatMap(array -> Arrays.stream(array))
							.filter(word -> word.equalsIgnoreCase("java"))
							.count();			
			
			System.out.println("Java count "+count);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
