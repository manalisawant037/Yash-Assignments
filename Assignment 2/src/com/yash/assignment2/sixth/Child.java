package com.yash.assignment2.sixth;

import java.util.Scanner;

public class Child implements StringComparison {
	
	public static void main(String[] args) {
		String first,second;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		first = sc.next();
		System.out.println("Enter second String");
		second = sc.next();
		Child c = new Child();
		c.comapareTwoString(first, second);
	}

	

	@Override
	public void comapareTwoString(String first, String second) {
		//super.comapareTwoString(first, second);
		int flagForStringOne=0,flagForStringTwo=0;
		for (int i = 0, j = 0; j < second.length() && i < first.length(); j++, i++) {

			if (first.charAt(i) > second.charAt(j)) {
				System.out.println(first.charAt(i) + " IS Greater Than : " + second.charAt(j));
				flagForStringOne++;
			}
			else if (first.charAt(i) < second.charAt(j)) {
				System.out.println(first.charAt(i) + " IS Less Than :" + second.charAt(j));
			}
			else {
				System.out.println("Both Strng Are Same");
			}

		}
		
		if (first.length()>second.length()) {
			System.out.println(first+" Is greater then "+second);
		}
		else if (first.length()<second.length()) {
			System.out.println(second+" Is greater then "+first);
		}
		else 
		{
			if (flagForStringOne > flagForStringTwo) {
				System.out.println(first + " IS Greater Than : " + second);
			}

			else if (flagForStringOne < flagForStringTwo) {
				System.out.println(first+ " IS Less Than :" + second);
				flagForStringTwo ++;
			}
			else {
				System.out.println("Both Are Same");
			}
		}
		
	}

}
