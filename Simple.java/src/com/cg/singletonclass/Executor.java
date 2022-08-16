package com.cg.singletonclass;

public class Executor {

	public static void main(String[] args) {
		MyClass obj=MyClass.getInstance();
		MyClass.count();
		System.out.println("creating one more reference....");
		MyClass obj1=MyClass.getInstance();
		MyClass.count();
		

	}

}
