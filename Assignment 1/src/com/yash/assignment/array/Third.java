//WAP to create a dynamic array. Dynamic Array means when user want to input the number 
//more than size of array it will increase the size of array without throwing exception.
package com.yash.assignment.array;

public class Third {

	public static void main(String[] args) {
		
		Dynamic add =new Dynamic(5);
		add.insert(77);
		add.insert(37);
		add.insert(66);
		add.insert(32);
		add.insert(87);
		add.insert(22);
		add.insert(90);
		
		add.printArray();
		
	}
}
