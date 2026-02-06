package classlogicalproblems;
import java.util.Scanner;

public class reverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int ans=0;
		while(a>0) {
			int num=a%10;
			ans = ans*10+num;
			a /=10;
			
		}
		System.out.println(ans);

	}

}
