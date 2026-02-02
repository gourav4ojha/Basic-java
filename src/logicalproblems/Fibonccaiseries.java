package logicalproblems;

import java.util.Scanner;

public class Fibonccaiseries {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	int firstnumber=0;
	int secondnumber=1;
	for (int i = 0; i <=num; i++) {
		System.out.print(firstnumber+" ");
		int thirdnumber=firstnumber+secondnumber;
		firstnumber=secondnumber;
		secondnumber=thirdnumber;
		sc.close();
		
	}
}
}
