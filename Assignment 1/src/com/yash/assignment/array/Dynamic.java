package com.yash.assignment.array;

public class Dynamic {

	  private int a[];
	    private int count;
	 
	    public Dynamic(int length) 
	    { 
	    	a = new int[length]; 
	    }
	
	    public void printArray()
	    {
	
	        for (int i = 0; i < count; i++) 
	        {
	            System.out.print(a[i] + " ");
	        }
	    }
	
	    public void insert(int element)
	    {
	 
	        if (a.length == count)
	        {
	            int newArray[] = new int[2 * count];
	            for (int i = 0; i < count; i++)
	            {
	            	newArray[i] = a[i];
	            }
	            	a = newArray;
	        }
	        a[count++] = element;
	    }
	
}
