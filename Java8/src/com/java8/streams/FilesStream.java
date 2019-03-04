package com.java8.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.java8.streams.helper.DvdInfo;

public class FilesStream {

	public static void main(String[] args) {
		
		List<DvdInfo> dvds = loadDvdInfo("src/com/java8/streams/helper/DvdInfo.txt");
		dvds.forEach(System.out::println);
		
	}

	private static List<DvdInfo> loadDvdInfo(String path) {
		
		List<DvdInfo> list = new ArrayList<DvdInfo>();
		
		try {
			
		Files.lines(Paths.get(path))
			.forEach(line -> {
				String[] info = line.split(" / ");
				list.add(new DvdInfo(info[0], info[1], info[2]));				
			});
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return list;
	}

}
