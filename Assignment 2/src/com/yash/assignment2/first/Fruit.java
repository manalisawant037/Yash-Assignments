package com.yash.assignment2.first;

public class Fruit 
{
	
	String fruitName;
	String fruitColor;
	
	public Fruit( String fruitName, String fruitColor) {
		super();
		
		this.fruitName = fruitName;
		this.fruitColor = fruitColor;
	}

	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public String getFruitColor() {
		return fruitColor;
	}
	public void setFruitColor(String fruitColor) {
		this.fruitColor = fruitColor;
	}
	
	@Override
	public String toString() {
		return "Fruit [ fruitName=" + fruitName + ", fruitColor=" + fruitColor + "]";
	}
	
	
}
