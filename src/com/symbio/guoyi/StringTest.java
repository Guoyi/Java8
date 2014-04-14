package com.symbio.guoyi;

public class StringTest {
	
	public static void main(String[] args) {
		String a = " Hello ";
		a += " World! ";
		a.trim();
		System.out.println(a);
		
		Object o1 = new String("hello");
		Object o2 = new String("hello");
		
		if (o1 == o2) {
			System.out.println("o1 == o2");
		}
		if (o1.equals(o2)) {
			System.out.println("o1 equals o2");
		}
		
		Object oo1 = "hello";
		Object oo2 = "hello";
		
		if (oo1 == oo2) {
			System.out.println("oo1 == oo2");
		}
		if (oo1.equals(oo2)) {
			System.out.println("oo1 equals oo2");
		}
	}

}