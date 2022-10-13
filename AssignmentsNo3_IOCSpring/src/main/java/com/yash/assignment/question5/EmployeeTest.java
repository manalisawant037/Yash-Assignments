package com.yash.assignment.question5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class EmployeeTest {

	public static void main(String[] args) 
	{
		  ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext.xml");
		  Employee objEmp = (Employee) objAC.getBean("empbfactory");
		  objEmp.empDetails();
	}
}
