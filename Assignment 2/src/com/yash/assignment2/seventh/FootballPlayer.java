package com.yash.assignment2.seventh;

import java.util.Scanner;

public class FootballPlayer extends Athletic{



	String teamName;
	int jersyNo;
	int totalGoals;
	int highestGoals;
	int highestGoalsInMatch;
	int totalMatchedPlayed;
	
	
	
	public FootballPlayer(int aId, String name, String address, String dob, String teamName, int jersyNo,
			int totalGoals, int highestGoals, int highestGoalsInMatch) {
		super(aId, name, address, dob);
		this.teamName = teamName;
		this.jersyNo = jersyNo;
		this.totalGoals = totalGoals;
		this.highestGoals = highestGoals;
		this.highestGoalsInMatch = highestGoalsInMatch;
		this.totalMatchedPlayed = totalMatchedPlayed;
	}



	public void footballPlayerDetails() 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter team Name : "+teamName);
		 
		System.out.println("Enter jersy Number : "+jersyNo);
		
		System.out.println("Enter total Goals : "+totalGoals);
		 
		System.out.println("Enter highest Goals : "+highestGoals);
		
		System.out.println("Enter highest Goals in Match : "+highestGoalsInMatch);
		 
		System.out.println("Enter total Match Played : "+totalMatchedPlayed);
		 
	}
	
}
