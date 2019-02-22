package com.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCustomObjects {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(234,"Kondal",5678));
		list.add(new Employee(7,"Chinni",3445));
		list.add(new Employee(56,"Vijaya",6767));
		list.add(new Employee(92,"Chinnodu",5645));
		list.add(new Employee(3,"Swathi",7898));
		
		Collections.sort(list, (e1, e2) -> (e1.getId() > e2.getId()) ? 1 : (e1.getId() < e2.getId()) ? -1 : 0);
		System.out.println(list);
		
	}

}

class Employee {
	
	private int id;
	private String name;
	private long sal;
	
	public Employee(int id, String name, long sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
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

	public long getSal() {
		return sal;
	}

	public void setSal(long sal) {
		this.sal = sal;
	}


	@Override
	public String toString() {
		return "Id : "+id+", Name : "+name+", Salary : "+sal +" \n ";
	}
	
}
