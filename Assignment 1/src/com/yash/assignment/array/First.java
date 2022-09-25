package com.yash.assignment.array;

//WAP to find third minimum number from list of numbers.
import java.util.Scanner;

public class First {
	public static void main(String[] args)
	{
		//Array Elements
		int a[]= {1,34,53,7,6,55,884};
		
		for(int i=0; i<a.length;i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[i]>a[j]) 
				{
					int temp = a[i];	
					a[i]=a[j];
					a[j]=temp;
				}
			}System.out.println("Sorted List : " + a[i]);
		}
		System.out.println();
		System.out.println("Third Smallest Element : " +a[2]);
		
		
		//Array Elements size given by user
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int noOfElement=sc.nextInt();
		int arr[]=new int[noOfElement];
		System.out.println("Enter array elemnts");
			for(int i=0;i<noOfElement;i++) {
				arr[i]=sc.nextInt();
			}
			
				for(int i=0;i<noOfElement;i++) {
					for(int j=i+1;j<noOfElement;j++) {
					if(arr[i]>arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
			}
			
		}
		int i;
		for( i=0;i<noOfElement;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("third minimum number :"+arr[2]);
		
	}
	

}
