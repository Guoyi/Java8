package com.symbio.guoyi.test;

import java.util.Random;

import com.symbio.guoyi.domain.Employee;

public class JavaTest {

	public static void main(String[] args) {
		JavaTest test = new JavaTest();
		
//		test.testEmployee();
		test.testRandom();
		
	}
	
	public void testEmployee() {
		System.out.println(new Employee("test").getName());

		System.out.println(Employee.toName());
	}
	
	public void testRandom() {
		Random random = new Random();
		
		int i = 0;
		while (i < 10) {
			System.out.println(random.nextInt(100));
			i++;
		}
		
	}

}
