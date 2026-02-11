package classArraysLogicalProgramsIn;
import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int n= sc.nextInt();
		System.out.println("Enter Elements of Array");
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int a:arr) {
			sum += a;
		}
		System.out.print("Sum of Array "+ Arrays.toString(arr) + " is " + sum);
	}
}
