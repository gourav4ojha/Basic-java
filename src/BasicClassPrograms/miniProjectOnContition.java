package BasicClassPrograms;

import java.util.Scanner;

public class miniProjectOnContition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b = 10;
		Scanner sc=new Scanner(System.in);
		String operator= sc.next();
		if(operator=="+")System.out.println(a+b);
		else if(operator.equals("-"))System.out.println(a-b);
		else if(operator.equals("%"))System.out.println(a%b);
		else System.out.println("no operator found");

	}

}
