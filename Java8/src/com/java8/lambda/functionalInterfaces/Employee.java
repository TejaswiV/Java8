package com.java8.lambda.functionalInterfaces;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Employee(int id, double salary) {
		this.id = id;
		this.salary = salary;
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
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "id: "+id+" Salary: "+salary;
	}

}
