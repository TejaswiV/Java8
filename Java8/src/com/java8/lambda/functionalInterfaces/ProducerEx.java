package com.java8.lambda.functionalInterfaces;

import java.util.Date;
import java.util.function.Supplier;

public class ProducerEx {

	public static void main(String[] args) {
		
		Supplier<Integer> s = () -> 25;		
		System.out.println(s.get());
		
		Supplier<Date> s2 = () -> new Date();
		System.out.println(s2.get());
		
		//Get random name from a list
		Supplier<String> name = () -> {			
			String[] names = {"Matt","Jenni","Rachel","Kate","Smith"};
			return names[(int)(Math.random()*4)];			
		};
		System.out.println(name.get());
		
		
		// Get Netbanking Code
		Supplier<String> s3 = () -> {
			String code = "";
			for(int i = 0; i < 6; i++) {
				code += (int)(Math.random() * 10);
			}
			return code;			
		};		
		System.out.println(s3.get());
		System.out.println(s3.get());
		
		// Get Random Password
		Supplier<String> password = () -> {
			String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@$^&0123456789";
			String pwd = "";
			for(int i = 0; i < 8; i++) {
				pwd += symbols.charAt((int)(Math.random()*39));
			}
			return pwd;
		};
		System.out.println(password.get());
	}

}
