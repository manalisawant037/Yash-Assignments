package com.yash.assignment2.second;

public class Triangle implements Shape
{
	private double base;
	private double height;

	@Override
	public double area(double a, double b) 
	{
		this.height = a;
		this.base = b;
		double area = Math.abs(0.5 *height *base);
		System.out.println("Triangle area : "+ area);
		return area;
		
	}
	
}
