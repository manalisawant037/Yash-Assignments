package com.yash.assignment2.first;

public class SweetFruit extends Fruit{
	
	String[] fruitinfo=	new String[6];
	String sweetfruit;
	public SweetFruit(String fruitName, String fruitColor,String[] fruitinfo,String sweetfruit) 
	{
		super(fruitName, fruitColor);
		this.fruitinfo = fruitinfo;
		this.sweetfruit=sweetfruit;
		
	}
	public void display(SweetFruit sf)
	{
		System.out.println("------------****Sweet Fruit information****--------------");
		System.out.println("Fruit Name ="+sf.fruitName);
		System.out.println("Fruit Color ="+sf.fruitColor);
		System.out.println("Nutrition summary");
		       for(String s:sf.fruitinfo)
		       {
		    	   System.out.print(s +" ");
		       }
		System.out.println();
		System.out.println("SourFruit bcz of sugar is =" +sf.sweetfruit);
		
	}



}
