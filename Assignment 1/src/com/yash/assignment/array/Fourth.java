//An Array contain the n numbers you have to find out combination which satisfy Pythagoras 
//Template. ( Pythagoras templates:- 3*3+4*4==5*5)
package com.yash.assignment.array;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size :");
		int size=sc.nextInt();
		System.out.println("Enter array elements : ");
		int inputArray[]=new int[size];
		for(int i=0;i<size;i++)
		{
		  inputArray[i]=sc.nextInt();
		}
		int first,second,third;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				for(int k=i+2;k<size;k++)
				{
					first=inputArray[i];
					second=inputArray[j];
					third=inputArray[k];
					if(first*first+second*second==third*third) 
						System.out.println(" "+first+" "+second+" "+third);
					
				}
			}
		}

	}

}
