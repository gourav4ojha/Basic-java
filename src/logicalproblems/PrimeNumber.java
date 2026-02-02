package logicalproblems;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		boolean isprime=true;//assume the given input number is prime
		for (int i =2; i <num/2; i++) {
			if(num%i==0)
			{
				isprime=false;
				break;
			}
		}
		if(isprime)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("nit");
		}
		sc.close();
	}

}
