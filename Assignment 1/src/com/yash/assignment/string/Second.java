package com.yash.assignment.string;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);  
        System.out.print("Enter a string: ");  
        String str1= sc.nextLine();
          
        System.out.print("Enter a string: ");  
        String str2= sc.nextLine();
        
        if (compStr(str1, str2))
            System.out.println("Yes");
        else
            System.out.println("No");
}


	 static int MAX = 256;
      
	    static boolean compStr(String str1, String str2)
	    {
	        int[] count = new int[MAX];
	        char []str3 = str1.toCharArray();
	        for (int i = 0; i < str3.length; i++)
	            count[str3[i]]++;
	  
	         
	        char []str4 = str2.toCharArray();
	        for (int i = 0; i < str4.length; i++) {
	            if (count[str4[i]] == 0)
	                return false;
	            count[str4[i]]--;
	        }
	        return true;
	   
	}
}
