package lab5;

import java.util.Scanner;

public class Fibonacci {
	public void Recursive(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		if(sc.hasNext()) {
			int n=sc.nextInt();
			if(n<0) {
				System.out.println("Fibonacci of negative number is not possible");
				
			}
			else {
				int result=fibo(n);
				System.out.println(n+"value of fibnoacci sequence is"+result);
			}
		}
		else {
			System.out.println("Enter whole number and no negative numbers");
		}
			
		
	}
	private int fibo(int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		else {
			return  fibo(n-1)+fibo(n-2);
		}
		
	}
	public void nonRecursive() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=sc.nextInt();
		int n1=1,n2=1,i=3;
		int sum=0;
		if(n==1)
		{
			System.out.println(n+"value of the fibonacci sequence is:"+0);
		}
		else if(n==2)
		{
			System.out.println(n+"value of fibonacci sequence is:"+1);
		}
		else {
			while(i<=n) {
				sum=n1+n2;
				System.out.println(sum);
				n1=n2;
				n2=sum;
				i++;
			}
			System.out.println(n+"value of fibonacci sequence is:"+sum);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a choice 1.Recursive 2.Non-Recursive");
		int choice=sc.nextInt();
		switch(choice) {
		case 1: 
			Fibonacci fi=new Fibonacci();
			fi.Recursive();
			break;
		case 2:
			Fibonacci fi2=new Fibonacci();
			fi2.nonRecursive();
			break;
			default:
				System.out.println("Invalid Input");
		}

	}

}
