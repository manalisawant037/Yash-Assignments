package com.yash.assignment2.first;

public class SourFruit extends Fruit{
	String[] fruitInfo=	new String[9];
	String sourt;
	

	public SourFruit(String fruitName, String fruitColor, String[] fruitinfo,String sourtest) {
		super(fruitName, fruitColor);
		this.fruitInfo = fruitinfo;
		this.sourt=sourtest;
	}

	public void display(SourFruit sf)
	{
		System.out.println("-----****----- SourFruits Details------****-------");
		System.out.println("Fruit Name ="+sf.fruitName);
		System.out.println("Fruit Color ="+sf.fruitColor);
		System.out.println("**Nutrition summary**");
		       for(String s:sf.fruitInfo)
		       {
		    	   System.out.print(s +" ");
		       }
		System.out.println();
		System.out.println("SourFruit bcz of sugar is =" +sf.sourt);
		System.out.println("*******************************************************");
	}

}
