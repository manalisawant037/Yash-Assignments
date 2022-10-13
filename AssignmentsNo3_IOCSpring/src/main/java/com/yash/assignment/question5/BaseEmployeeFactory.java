package com.yash.assignment.question5;



public class BaseEmployeeFactory {

	public Employee getEmployee()
	{
		return new Clerk();		
	}	

	
}
