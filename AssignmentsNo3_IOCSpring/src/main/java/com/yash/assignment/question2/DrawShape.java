package com.yash.assignment.question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.assignment.question3.ConstructorMessage;

public class DrawShape 
{
	public static void main(String[] args) {
		 ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext.xml");
		 Shape c =(Shape) objAC.getBean("rectangle");
		c.draw();
	}
}
