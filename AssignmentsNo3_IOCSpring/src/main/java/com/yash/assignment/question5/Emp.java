package com.yash.assignment.question5;

public class Emp {

	private Emp()
	{		
	  System.out.println(" constructor is called");	
	}
	public static Emp getEmp()
	{
		System.out.println("Object of Class emp is return:- static method getEmp called");
		return new Emp();
	}
	public void show()
	{
		System.out.println("Data is printed");		
	}
}
