package lab5;

import java.util.Scanner;


public class Light {

	public static void main(String[] args) {
		String str;
		System.out.println("Enter red to stop, yellow to get Ready and green to go:");
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		switch(str) {
		case "red":
			System.out.println("Please Stop");
			break;
		case "yellow":
			System.out.println("Get Ready");
			break;
		case "green":
			System.out.println("You can go");
			break;
		default:
			System.out.println("Invalid choice");
			}
		}
	}
