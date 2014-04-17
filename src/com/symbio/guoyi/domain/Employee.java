package com.symbio.guoyi.domain;

public class Employee {
	
	public Employee() {
		
	}
	
	public Employee(String name) {
		System.out.println(name);
		setName(name);
	}
	
	private static String name = "kevin";

	public void setName(String name) {
		Employee.name = name;
	}

	public String getName() {
		return name;
	}
	
	public static String toName() {
		return name;
	}

}
