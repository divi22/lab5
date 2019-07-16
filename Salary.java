package com.cg.eis.exception;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your salary:");
		int salary=0,flag=1;
		String str=sc.next();
		try {
			salary=Integer.parseInt(str);
		}
		catch(NumberFormatException ex ) {
			flag=0;
			System.out.println("not an integer");
		}
		try {
			if(flag==1)
			{
					if(salary<3000)
					{
						throw new EmployeeException(str);
					}
					else {
						System.out.println("Your salary is:"+salary);
					}
				}
			}
			catch(EmployeeException ee) {
				System.out.println("Salary should be greater than or equal to 3000");
			}
		

	}

}
