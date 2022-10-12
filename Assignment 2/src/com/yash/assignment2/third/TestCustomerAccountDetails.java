package com.yash.assignment2.third;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TestCustomerAccountDetails {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Account no : ");
		int accountNo=sc.nextInt();
		
		System.out.println("Enter the customer name :");
		String custName=sc.next();
	
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter customer date of birth (dd/MM/yyyy):");
        String custDob = sc.next();

		System.out.println("Enter the customer address :");
		String custAddress=sc.next();
		
        System.out.println("Enter customer account opening date (dd/MM/yyyy):");
        String custAaccountOpeningDate = sc.next();
        
		System.out.println("Enter branch id  : ");
		int bID=sc.nextInt();
		
		System.out.println("Enter branch name : ");
		String bName=sc.next();
		
		System.out.println("Enter branch address : ");
		String branchAddress=sc.next();
		
		System.out.println("Enter CAID : ");
		int CAID=sc.nextInt();
		
		System.out.println("Enter CustId : ");
		int custId=sc.nextInt();
		
		System.out.println("Enter amount : ");
		int amount=sc.nextInt();
		
		System.out.println("Enter deposit withdrawl  : ");
		int depositWithdrawl=sc.nextInt();
		
		 System.out.println("Enter deposit date (dd/mm/yyyy):");
	        String depositDate = sc.next();
	       
	        Branch b = new Branch(bID,bName,branchAddress);
			
	        	Customer cust = new Customer(accountNo,custName,custAddress,custDob,custAaccountOpeningDate,
	        		b);
		       cust.displayCustomerDetails();		
	        
		       CustomerAccountStatement c = new CustomerAccountStatement(CAID,custId,amount,
				depositWithdrawl,depositDate);
		
		       c.displayCustomerAccountStatementInfo();

	}

}
