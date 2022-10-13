package com.yash.assignment.question3;

//Create a class called ConstructorMessage with a single member
//variable called message which is initialized with null.The
//class will have a parameterized constructor which initializes
//the member variable called message. Instantiate this class
//using Inversion control and test. [Perform Constructor
//Injection

public class ConstructorMessage {
	
	String message =null;
	
	public ConstructorMessage(String msg) {
		this.message = msg;
	}

	public void show() 
	{
		System.out.println("This is : "+message);
	}
}
