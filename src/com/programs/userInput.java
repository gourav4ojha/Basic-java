package com.programs;
import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);		
		System.out.println("Enter name: ");
		String st = sc.next();
		System.out.println("Welcome "+st);
        sc.close();
        
	}

}
