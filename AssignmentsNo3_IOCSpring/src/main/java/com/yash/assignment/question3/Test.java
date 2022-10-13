package com.yash.assignment.question3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		 ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext.xml");
		 ConstructorMessage c =(ConstructorMessage) objAC.getBean("message");
		 c.show();
	}
}
