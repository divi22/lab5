//print prime number upto integer provided by user
package lab5;

import java.util.Scanner;


public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any integer(2 or above):");
		if(sc.hasNextInt()) {
			int number=sc.nextInt();
			if(number<=1) {
				System.out.println("Number is invalid");
			}
			else {
				for(int i=2;i<number;i++) {
					int p=0;
					for(int j=2;j<i;j++) {
						if(i%j==0) {
							p=1;
						}
					}
					if(p==0) {
						System.out.println(i+"is prime number");
					}
				}
			}
		}
		else {
			System.out.println("Invalid Input");
		}
	

	}

}
