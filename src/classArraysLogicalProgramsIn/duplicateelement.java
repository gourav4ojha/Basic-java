package classArraysLogicalProgramsIn;

import java.util.Arrays;

public class duplicateelement {
	public static void main(String[] args) {
		int[] arr={4,2,2,2,7,2,5,4,9};
//		for (int i = 0; i < arr.length; i++) {
//			for (int j =i+1; j < arr.length; j++) {
//				if(arr[i]==arr[j])
//				{
//					System.out.println(arr[i]);
//					break;
//				}
//			}		
//		}
		
		Arrays.sort(arr);
		int j= arr[0];
		System.out.println(j);
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=j) {
				System.out.println(arr[i]);
				j=arr[i];
			}
		}
	}

}
