package com.yash.assignment.array;

import java.util.Arrays;

public class Eight 
{

	public static void characterSort(char array[],int size) 
	{

	int start =0;
	int mid=size/2;
	int end=size-1;

	while(start<end) 
	{
		if(array[start] == 'a'||array[start] == 'e'||array[start] == 'i'||array[start] == 'o'||array[start] == 'u') {

			start++;
	}
	else 
	{
		swap(array,start,end);
		end--;
	}

	}

	}

	public static void swap(char array[],int start, int end) 
	{
		char temp = array[start];
		array[start] = array[end];
		array[end] = temp;
	}
	public static void main(String[] args)
	{
		char array[] = {'a','b','c','e','d','i','o','s','u','x','q','z'};
		int size = array.length;
		characterSort(array,size);
		System.out.println(Arrays.toString(array));
	}

}
