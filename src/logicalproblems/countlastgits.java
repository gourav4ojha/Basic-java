package logicalproblems;

import java.util.Scanner;

public class countlastgits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
//		int count=0;
//		while(num>0) {
//			int ld =num%10;
//			count++;
//			num=num/10;
//		}
		System.out.println(num%10);
		sc.close();
	}

}
