package logicalproblems;
import java.util.Scanner;

public class evencountoddcount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int evencount=0;
		int oddcount=0;
		for (int i = 0; i <=num; i++) {
			if(i%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
			
		}
		System.out.println(evencount);
		System.out.println(oddcount);
		sc.close();
		
	}
	

}
