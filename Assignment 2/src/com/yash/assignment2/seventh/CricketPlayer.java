package com.yash.assignment2.seventh;

import java.util.Scanner;

public class CricketPlayer extends Athletic
{
//	public CricketPlayer(int aId, String name, String address, String dob) {
//		super(aId, name, address, dob);
//		// TODO Auto-generated constructor stub
//	}

	String teamName;
	int jersyNo;
	int totalRuns;
	int highestScore;
	int avg;
	int totalMatchedPlayed;
	
	public CricketPlayer(int aId, String name, String address, String dob, String teamName, int jersyNo, int totalRuns,
			int highestScore, int avg, int totalMatchedPlayed) {
		super(aId, name, address, dob);
		this.teamName = teamName;
		this.jersyNo = jersyNo;
		this.totalRuns = totalRuns;
		this.highestScore = highestScore;
		this.avg = avg;
		this.totalMatchedPlayed = totalMatchedPlayed;
	}

	public void cricketPlayerDetails() 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter team Name : "+teamName);
		 
		System.out.println("Enter jersy Number : "+jersyNo);
		
		System.out.println("Enter total Runs : "+totalRuns);
		
		System.out.println("Enter Highest Score : "+highestScore);
		
		System.out.println("Enter avg : "+avg);
		 
		System.out.println("Enter total Match Played : "+totalMatchedPlayed);
	
	}
	
	public static void main(String[] args) 
	{
		
	}
}
