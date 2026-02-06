package classlogicalproblems;

import java.util.Scanner;

public class PrimeNumber {
	
	// numbers only devisible by 1 and itself
	// finding prime numbers from 1 to 100
	
	public static void main(String[] args) {

		for(int num=1; num<=100; num++) {
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
				System.out.println("prime number"+ num);
			}
		}
		
	}

}
