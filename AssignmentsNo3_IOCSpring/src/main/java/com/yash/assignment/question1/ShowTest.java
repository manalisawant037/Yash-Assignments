package com.yash.assignment.question1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.assignment.question2.Shape;

public class ShowTest 
{
	public static void main(String[] args) {
		
		 ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext.xml");
		 Movie c =(Movie) objAC.getBean("movie1");
		 c.showMovie();
		 CinemaHall ch = (CinemaHall) objAC.getBean("cinemahall1");
		 ch.showCinemaHall();
		 City ct =(City) objAC.getBean("city1");
		 ct.showCity();
		 
		 Movie c2 =(Movie) objAC.getBean("movie2");
		 c2.showMovie();
		 CinemaHall ch2 = (CinemaHall) objAC.getBean("cinemahall3");
		 ch2.showCinemaHall();
		 City ct2 =(City) objAC.getBean("city2");
		 ct2.showCity();
		 
		 Movie c3 =(Movie) objAC.getBean("movie3");
		 c3.showMovie();
		 CinemaHall ch3 = (CinemaHall) objAC.getBean("cinemahall3");
		 ch3.showCinemaHall();
		 City ct3 =(City) objAC.getBean("city3");
		 ct3.showCity();
	}
	
}
