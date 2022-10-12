package com.yash.assignment2.second;

public class Circle implements Shape 
{
	double r;
	@Override
	public double area(double a, double b) {
		double circleRadius = Math.abs(3.14*a*a);
		System.out.println("Circle Radius is : "+circleRadius );
		return circleRadius;
	}
	
}
