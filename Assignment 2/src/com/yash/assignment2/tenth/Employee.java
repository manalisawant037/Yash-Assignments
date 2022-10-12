//WAP to print the object of Employee class with the help of toString method. 
//Employee class fields :- empid, empname, empsalary, empaddress, emp_dob, 
//emp_doj. use Date class to store the date of birth(dob) and date of joining(doj). 
package com.yash.assignment2.tenth;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Employee {
	// Date date =new Date();
	// date = dob;
	private int empId;
	private String empName;
	private double empSalary;
	private String address;
	private int year;
	private int month;
	private int date;

	private LocalDate emp_dob;
	private LocalDate emp_doj;

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", address=" + address
				+ ", year=" + year + ", month=" + month + ", date=" + date + ", emp_dob=" + emp_dob + ", emp_doj="
				+ emp_doj + "]";
	}

	public Employee(int empId, String empName, double empSalary, String address, LocalDate emp_dob, LocalDate emp_doj) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.address = address;
		this.year = year;
		this.month = month;
		this.date = date;
		this.emp_dob = emp_dob;
		this.emp_doj = emp_doj;
	}

	public static void main(String[] args) {

		Employee e = new Employee(1, "Manali", 40000.00, "Karad", LocalDate.of(1997, 10, 12),
				LocalDate.of(2020, 10, 23));
		System.out.println(e);

	}

}
