package logicalproblems;

import java.util.Scanner;

public class Reversenumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		while(num>0)
		{
			//step1 find the lastdigits
			int lastdigits=num%10;
			rev=rev*10+lastdigits;
			//find the new number
			num=num/10;//num=123  12  1  0
		}
		System.out.println(rev);
		if(rev==temp)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrme");
		}
		sc.close();
	}

}
