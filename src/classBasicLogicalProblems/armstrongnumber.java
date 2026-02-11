package classBasicLogicalProblems;

import java.util.*;

// number = sum of digit power(count of digit);

public class armstrongnumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		int cnt=0;
		while(num>0) {
			num /=10;
			cnt++;
		}
		num=temp;
		while(num>0)
		{
			//find the last digit
			int lastdigit=num%10;
			sum += Math.pow(lastdigit, cnt);
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
