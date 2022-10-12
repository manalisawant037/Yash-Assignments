package com.yash.assignment2.fifth;

import java.util.Scanner;

public class MaxNumString
{
	public static String getLongestStringAndNumber(String []array) 
	{
		 int maxLength = 0;
	      String longestString = null;
	      for (String s : array) {
	          if (s.length() > maxLength) {
	              maxLength = s.length();
	              longestString = s;
	          }
	      }
	      return longestString;

	}

	public static int getLongestStringAndNumber(int []arr) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
		
	}
	public static void main(String[] args) 
	{
		 String[] names = {"dia","Drishita","Sia"};
		    String a = getLongestStringAndNumber(names);
		    System.out.println(a);
		    System.out.println("Maximum lenght of String - Name is: "+a+ " and length: "+a.length());
		    int[] num = {23,54,2,5,67,6,77};
		   int maxNumber = getLongestStringAndNumber(num);
		   System.out.println("Maximum length Number" + maxNumber);  
	}
}
