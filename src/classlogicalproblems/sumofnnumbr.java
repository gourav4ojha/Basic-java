package classlogicalproblems;

import java.util.Scanner;

public class sumofnnumbr {
	public static void main(String[] args) {
		Scanner  sc =new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		sc.close();
	}

}
