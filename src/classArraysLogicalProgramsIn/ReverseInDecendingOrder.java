package classArraysLogicalProgramsIn;

import java.util.Arrays;

public class ReverseInDecendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,5,3,77,43,25,1,7,0};
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
