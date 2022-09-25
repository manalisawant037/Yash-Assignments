// You are having array of numbers. Now you have to arrange numbers in array on the basis of the 
// length of each number. Smallest number length will be first and so on. 
package com.yash.assignment.array;

public class Tenth {

	public static void main(String[] args) {
		int [] a = new int [] {77,12,45,33,8,999};
		int temp = 0;

		System.out.println("Elements of original array: ");
		for (int i = 0; i < a.length; i++) {
		       System.out.print(a[i] + " ");
		}
		for (int i = 0; i < a.length; i++)
		{
		    for (int j = i+1; j < a.length; j++)
		   {
		       if(a[i] > a[j]) {
		        temp = a[i];
		        a[i] = a[j];
		         a[j] = temp;
		       }
		      }
		}

		System.out.println();

		System.out.println("After Sorting Array elemnts are: ");
		for (int i = 0; i < a.length; i++)
		{
	          	System.out.print(a[i] + " ");
		}

	}
}
