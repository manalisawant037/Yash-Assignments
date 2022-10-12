package com.yash.assignment2.second;

import java.util.Scanner;

public class TestArea {
	public static void main(String[] args) {
		
	
	   Scanner sc= new Scanner(System.in);
       System.out.println("Select the shape :");
       System.out.println("1.Circle \n2.Traingle \n3.Sphere \n4.Exit" );
       System.out.println("Please enter any of the above option: ");
       int num = sc.nextInt();
       double radius;
      // Double b;
       
       if(num==1) 
       {
        	  System.out.println("Please enter radius of circle: ");
        	  radius = sc.nextDouble();
	          Circle c = new Circle();
	          System.out.println("Area Of Circle");
	   		  c.area(radius, 0);
	   		  System.out.println("");
       
       }
       if(num==2) 
       {
        	  System.out.println("Please enter base of triangle: ");
	          double base = sc.nextDouble();
	          System.out.println("Enter height");
	          double height = sc.nextDouble();
	          Triangle triangle=new Triangle();
	            triangle.area(base, height);
       }
       if(num==3) 
       {
        	  	  System.out.println("Please enter radius of Sphere: ");
          		  radius=sc.nextDouble();
		          Sphere sphere=new Sphere();
		        
		          sphere.area(radius, 0);
       }
       if(num==4)
          System.exit(0);
       }
    
    }
