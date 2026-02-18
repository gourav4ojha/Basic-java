package classArraysLogicalProgramsIn;

import java.util.Arrays;

public class FirstHalfAccendingSecondHalfDecending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,6,98,8,22,66,2,78,6,8,6,7};
		Arrays.sort(arr);
		int low=0;
		int high=arr.length-1;
//		int mid = arr.length/2;
		int mid= low+((high-low)/2);
		System.out.println("mid"+mid);
		for(int i=0; i<mid; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int j=arr.length-1; j>=mid; j--) {
			System.out.print(arr[j]+" ");
		}

	}

}
