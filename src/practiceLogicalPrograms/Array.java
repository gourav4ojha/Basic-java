package practiceLogicalPrograms;
import java.util.*;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        int arr[] = {2,4,5,6,8,7,9};
//        int sum=0;
//        for(int i:arr) {
//        	if(i%2==0)sum+=i;
//        }
//        System.out.println(sum);
//        
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1) {
			System.out.println('0');
			return;
		}
		int arr[] = new int[n];
		arr[0]=0;
		arr[1]=1;
		
		for (int i=2; i<n; i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
