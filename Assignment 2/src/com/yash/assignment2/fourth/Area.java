package com.yash.assignment2.fourth;

import java.util.Scanner;

public class Area 
{
	static int side1;
	static int side2;
	static int side3;
	static int square=0;
	public void findsquare() 
	{
		if(side1==side2) 
		{
			 square= side1*side2;
			 System.out.println("square is : "+square);
			 //System.out.println("Area of square is : "+square);
		}
		else if(side1==side3) 
		{
			 square =side1*side3;	
			 System.out.println("Area of square is : "+square);
		}
		else if(side2==side3) 
		{
			square = side2*side3;
			System.out.println("Area of square is : "+square);
		}
		else {
			System.out.println("Sides are not same, Square not found..");
			System.out.println();
		}
	}
	
	public void rectangle() 
	{
		int firstCombination = side1* side2;
		int secondCombination = side1*side3;
		int thirdCombination = side2*side3;
		System.out.println("Rectangle First Combination is : "+firstCombination);
		System.out.println("Rectangle second Combination is : "+secondCombination);
		System.out.println("Rectangle third Combination is : "+thirdCombination);
	}
	
	public void triangle()
	{
		if((side1+side2)>side3 && (side1+side3)>side2 && (side2+side3)>side1) {
			int s = (side1+side2+side3)/2;
			int area = (int) Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
			System.out.println("Area of Triangle is : "+area);
		}else {
			System.out.println("The triangle with entered dimensions does not exist...");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		Area a =new Area();
		System.out.println("Enter First Side : ");
		side1 =sc.nextInt();
		System.out.println("Enter second side : ");
		side2 =sc.nextInt();
		System.out.println("Enter second side : ");
		side3 =sc.nextInt();
		a.findsquare();
		a.rectangle();	
		a.triangle();
	}
}
