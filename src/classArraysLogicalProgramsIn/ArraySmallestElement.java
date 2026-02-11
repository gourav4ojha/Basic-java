package classArraysLogicalProgramsIn;

import java.util.Scanner;
import java.util.Arrays;

public class ArraySmallestElement {


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
		
//		Method 1
		
//		 int smallest = arr[0];
		 int smallest = Integer.MAX_VALUE;
		 for(int a: arr) {
			 if(smallest > a) smallest = a;
		 }
		 System.out.println("smallest using smallest variable: " + smallest);
		 
//		 Method 2
		 
		 Arrays.sort(arr);
		 System.out.println("smallest using sort: " + arr[0]);
		 
//		 Method 3 Use Math.min(smallest, a) and Math.max(largest,a)
		 
		int largest = Integer.MIN_VALUE;
		 for(int a: arr) {
			smallest = Math.min(smallest, a); 
			largest =  Math.max(largest,a);
		 }
		 System.out.println("smallest using Math Library: " + smallest);
		 System.out.println("laegest using Math Library: " + largest);
		 
        

	}

}
