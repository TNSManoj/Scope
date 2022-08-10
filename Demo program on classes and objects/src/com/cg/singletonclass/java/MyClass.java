package com.cg.singletonclass.java;

public class MyClass {
	static MyClass obj=new MyClass();
	static int countobj;
	private MyClass()
	{
		System.out.println("MYCLASS objects created");
	}
	public static MyClass getInstance() {
		return obj;
	}
	public static void count() {
		// TODO Auto-generated method stub
		countobj++;
		System.out.println("Total objects are :"+countobj);
		
	}

}

