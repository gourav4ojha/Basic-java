package logicalproblems;

import java.util.Scanner;

public class perfectnumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int sum=0;
		for (int i =1; i <num; i++) {
			if(num%i==0)//find the factor of given nmber
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
		if(sum==num)
		{
			System.out.println("perfect");
		}
		else
		{
			System.out.println("not");
		}
		sc.close();
	}

}
