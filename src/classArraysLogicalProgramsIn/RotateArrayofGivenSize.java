package classArraysLogicalProgramsIn;

import java.util.Arrays;

public class RotateArrayofGivenSize {
	public static void reverse(int [] arr, int start, int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		int n = arr.length;
		int l=0;
		int k = l+(n-l)/2;
		reverse(arr,0,n-1);
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);
		
		System.out.print(Arrays.toString(arr));

	}

}
