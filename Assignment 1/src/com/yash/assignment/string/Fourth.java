package com.yash.assignment.string;

public class Fourth {

	public static void main(String[] args)
	{
		String str="mns";
		int strSize = str.length();
		int count=1,totalSum=0;
		char[] charArr= new char[strSize];
		for(int i=0;i<strSize;i++) 
		{
			charArr[i]=str.charAt(i);
		}
		for(char ch : charArr) {
			int chInt = ch;
			if(chInt >= 65 && chInt <= (65+26)) 
			{
				for(int i='A'; i<'Z'; i++,count++) 
				{
					if(chInt==i) 
					{
						totalSum+=count;
						break;
					}
				}
			}
			else 
			{
				for(int i='a',count1=1; i<'z'; i++,count1++)
				{
					if(chInt==i) 
					{
						totalSum+=count1;
					}
				}
				
			}
		}
		System.out.println("Total sum is: "+totalSum);


	}
}
