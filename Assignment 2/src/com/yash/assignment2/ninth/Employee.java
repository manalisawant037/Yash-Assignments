
//WAP to demonstrate the use of clone method. Clone one object of Employee class :-
//empId, empName, empSalary and deptname. When you clone object of class 
//Employee change the values. With the help of instanceOf check that the newly 
//created object is belong to Employee class or not. Also compare both object are same 
//or not
package com.yash.assignment2.ninth;

public class Employee implements Cloneable{
	
	int empId; 
	String empName; 
	int empSalary;
	String deptname;
	
	public Employee(int empId, String empName, int empSalary, String deptname) 
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.deptname = deptname;
	}
	
	public Object clone () throws CloneNotSupportedException
	{
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Employee one = new Employee(101,"Sia",12000,"JAVA");
		Employee two = new Employee(102,"Drisha",1000,"Testing");
		two =(Employee) one.clone();
		
		System.out.println(two.deptname);
		System.out.println(two.empId);
		System.out.println(two.empName);
		System.out.println(two.empSalary);
		
		if (two instanceof Employee) 
		{
			System.out.println("Yes It Is Object Of Class ProgramNine");
		}
		System.out.println(one == two);
		
	}

	
	
}
