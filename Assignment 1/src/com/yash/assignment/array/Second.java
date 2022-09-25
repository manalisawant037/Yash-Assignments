//WAP to remove duplicate numbers from list of numbers.
package com.yash.assignment.array;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size :");
		int size=sc.nextInt();
		System.out.println("Enter array elements :");
		int inputArr[]=new int[size];
			for(int i=0;i<size;i++)
			{
				inputArr[i]=sc.nextInt();
			}
			int count=0;
			for(int i=0;i<size;i++)
			{
				for(int j=i+1;j<size;j++)
				{
					if(inputArr[i]==inputArr[j]) {
		                    System.out.println("Duplicate Elements Are :" + inputArr[i]);
		                    inputArr[j] = inputArr[size - 1];
		                    size--;
		                }
				}
			}
		System.out.println();
		System.out.println("Distinct Array Elements are : ");
        for(int i = 0; i < size; i++)
        {
            System.out.println(inputArr[i]);
        }
	}
}
