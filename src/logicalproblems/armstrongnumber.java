package logicalproblems;

import java.util.Scanner;

public class armstrongnumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		while(num>0)
		{
			//find the last digit
			int lastdigit=num%10;
			sum=sum+lastdigit*lastdigit*lastdigit;//lastdiit**3
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
		sc.close();
	}

}
