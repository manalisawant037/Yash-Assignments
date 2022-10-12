package com.yash.assignment2.second;

public class Sphere implements Shape {
	double a;
	@Override
	public double area(double a,double b) {
		double surfaceArea = 0.0;
		surfaceArea = Math.abs(a*a);
		System.out.println("Sphere Surface area : " + surfaceArea);
		return surfaceArea;
	}

}
