package classBasicLogicalProblems;

import java.util.Scanner;

// perfect numbers are whose sum of its factors is equal to the number
// 1 to 100 perfect number

public class perfectnumber {
	public static void main(String[] args) {
	for(int num=1; num<=100; num++) {
		int sum=0;
		for (int i =1; i <num; i++) {
			if(num%i==0)//find the factor of given nmber
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println("perfect: "+num);
		}
	}

	}

}
