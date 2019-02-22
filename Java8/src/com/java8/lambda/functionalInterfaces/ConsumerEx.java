package com.java8.lambda.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerEx {
	

	// Display Student details along with grades whose marks are >= 60 
	

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "Amala", 60));
		list.add(new Student(2, "Vimala", 80));
		list.add(new Student(5, "Kamala", 25));
		list.add(new Student(6, "Karuna", 55));
		list.add(new Student(9, "Sandhya", 32));
		list.add(new Student(3, "Swetha", 78));
		
		Predicate<Student> p = student -> student.getMarks() >= 60;
		Function<Student, String> f = (student) -> {
				int marks = student.getMarks();
				if(marks >= 80) {
					return "A";
				}else if(marks >= 60) {
					return "B";
				}else if(marks >= 50) {
					return "C";
				}else if(marks >= 35) {
					return "D";
				}else {
					return "E";
				}				
		};
		
		Consumer<Student> c = student -> {
			System.out.println("Id "+student.getId()+" Name "+student.getName()+" Grade "+f.apply(student));
		};
		
		for (Student stud : list) {
			if(p.test(stud)) {
				c.accept(stud);
			}
		}
		

	}

}


class Student{
	
	private int id;
	private String name;
	private int marks;
	
	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}
