package com.yash.assignment.question4;

//Create a class called ConstructorMessage with a single member
//variable called message which is initialized with null.The
//class will have a parameterized constructor which initializes
//the member variable called message. Instantiate this class
//using Inversion control and test. [Perform Constructor
//Injection

public class SetterMessage {
	
	String message =null;
	
//	public String getMessage() 
//	{
//		return message;
//	}
	public void setMessage(String message) 
	{
		this.message = message;
	}
	public void show() 
	{
		System.out.println("This is : "+message);
	}
}
