package com.yash.assignment.question4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		 ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext.xml");
		 SetterMessage c =(SetterMessage) objAC.getBean("msg");
		 c.show();
	}
}
