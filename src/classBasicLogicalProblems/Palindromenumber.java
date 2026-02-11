package classBasicLogicalProblems;

import java.util.Scanner;

// palindrome numbers are equal of reverse of its difit  ex 123321

public class Palindromenumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		while(num>0)
		{
			int lastdigits=num%10;
			rev=rev*10+lastdigits;
			num=num/10;
		}
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
