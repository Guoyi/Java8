package com.symbio.guoyi.test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.symbio.guoyi.domain.Employee;

public class JavaTest {

	public static void main(String[] args) {
		JavaTest test = new JavaTest();
		
//		test.testEmployee();
		
//		test.testRandom();
		
//		test.testMap();
		
		test.testAsynchronous();
		
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
	
	public void testMap() {
		Map<String, String> map = new HashMap<String, String>();
		
		Map<String, String> table = new Hashtable<String, String>();
		
		map.put(null, "empty");
		map.put("1", "1");
		map.put("2", "2");
		
		// NullPointerException
//		table.put(null, "NULL"); 
		table.put("1", "1");
		table.put("2", "2");
		
		System.out.println(map.get(null));
	}
	
	public void testAsynchronous() {
		System.out.println("Start main method ... ");
		
		ExecutorService exe = Executors.newCachedThreadPool();
		
		exe.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Start runnable method ... ");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("End runnable method ... ");
				
			}
		});
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("End main method ...");
	}

}
