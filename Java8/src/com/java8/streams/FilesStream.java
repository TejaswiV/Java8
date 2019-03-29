package com.java8.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.streams.helper.DvdInfo;

public class FilesStream {

	public static void main(String[] args) {
		
		List<DvdInfo> dvds = loadDvdInfo("src/com/java8/streams/helper/DvdInfo.txt");
		dvds.forEach(System.out::println);
		
	}

	private static List<DvdInfo> loadDvdInfo(String path) {
		
		List<DvdInfo> list = new ArrayList<DvdInfo>();
		
		try {
			
		/*Files.lines(Paths.get(path))
			.forEach(line -> {
				String[] info = line.split(" / ");
				list.add(new DvdInfo(info[0], info[1], info[2]));				
			}); */
			
			
			list = Files.lines(Paths.get(path))
					.map(line -> {
						String[] info = line.split(" / ");
						return new DvdInfo(info[0], info[1], info[2]);		
					})
					.collect(Collectors.toList());
			
		/*list = Files.lines(Paths.get(path))
				.map(line -> new DvdInfo(line.split(" / ")[0], line.split(" / ")[1], line.split(" / ")[2]))
				.collect(Collectors.toList());
		*/	
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return list;
	}

}
