package com.yash.assignment2.seventh;

import java.util.Scanner;

public class Test
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID");
		int aid=sc.nextInt();
		
		System.out.println("Enter name of the player");
		String name=sc.next();
		
		System.out.println("Enter the address");
		String address=sc.next();
		
		System.out.println("Enter dateOFBirth");
		String dateOFBirth=sc.next();
		
		System.out.println("Enter the team name");
		String teamName=sc.next();
		 
		 System.out.println("Enter jersyno:- ");
		 int jersyno=sc.nextInt();
		 
		 System.out.println("Enter total runs:- ");
		 int totalruns=sc.nextInt();
		 
		 System.out.println("Enter highestScore:- ");
		int highestscore=sc.nextInt();
		
		System.out.println("Enter the average:-  ");
		int avg=sc.nextInt();
			
		System.out.println("Total matches played");
		int totalmatchedplayed=sc.nextInt();
		
		System.out.println("*********Hockey Player*******");
		Hockey h=new Hockey(aid,name,address,dateOFBirth,teamName,jersyno,
				        totalruns,highestscore,totalmatchedplayed);
		h.hockeyPlayerDetails();
		
		System.out.println("*********FootBallPlayer*******");
		FootballPlayer f=new FootballPlayer(aid, name, address, dateOFBirth,
				teamName, jersyno, highestscore, avg, totalmatchedplayed);
		f.footballPlayerDetails();
		
		System.out.println("*********CricketPlayer Player*******");
		CricketPlayer c=new CricketPlayer(aid, name, address, dateOFBirth, teamName, jersyno, totalruns, 
				highestscore, avg, totalmatchedplayed);
		c.cricketPlayerDetails();
	

	};

}
