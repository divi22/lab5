package lab5;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name");
		String fname=sc.nextLine().trim();
		System.out.println("Enter last name");
		String lname=sc.nextLine().trim();
		int flag=0;
		try {
			if(fname.isEmpty()||lname.isEmpty()) {
				flag=1;
				throw new UserDefinedException("Please enter your firstname and lastname");
			}
			if(fname.equals("")&&lname.equals("")) {
				throw new UserDefinedException("Please enter your firstname and lastname");
			}
			else {
				System.out.println("Your full name is " +fname+" "+lname);
			}
		}
			catch(UserDefinedException e) {
				System.out.println("Exception caught");
				System.out.println(e.getMessage());
			}
		}
		
	}



