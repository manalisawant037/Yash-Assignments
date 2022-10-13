package com.yash.assignment.question6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext.xml");
		 Vehicle v =(Vehicle) objAC.getBean("vehicle1");
		 v.showVehicle();
	}
}
