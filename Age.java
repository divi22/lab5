package lab5;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		System.out.println("Enter your age:");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		
		try {
			if(age<15){
				throw new UserDefinedException("Age should be above 15");
				
			}
			else {
				System.out.println("Your age is"+age);
			}
		}
		catch(UserDefinedException e) {
			System.out.println("Exception caught");
			System.out.println(e.getMessage());
		}
		
	}

}
