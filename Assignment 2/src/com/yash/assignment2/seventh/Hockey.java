package com.yash.assignment2.seventh;

import java.util.Scanner;

public class Hockey extends Athletic
{
	
	String teamName;
	int jersyNo;
	int totalGoals;
	int highestGoalsInMatch;
	int totalMatchedPlayed;
	
	
	
	public Hockey(int aId, String name, String address, String dob, String teamName, int jersyNo, int totalGoals,
			int highestGoalsInMatch, int totalMatchedPlayed) {
		super(aId, name, address, dob);
		this.teamName = teamName;
		this.jersyNo = jersyNo;
		this.totalGoals = totalGoals;
		this.highestGoalsInMatch = highestGoalsInMatch;
		this.totalMatchedPlayed = totalMatchedPlayed;
	}



	public void hockeyPlayerDetails() 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Hockey team Name : " +teamName);
		
		System.out.println("Hockey jersy Number : "+ jersyNo);
		
		System.out.println("Hockey total Goals : "+totalGoals);
		
		System.out.println("Hockey highest Goals in Match : "+highestGoalsInMatch);
		
		System.out.println("Hockey total Match Played : "+totalMatchedPlayed);
		 
	}
	
}
