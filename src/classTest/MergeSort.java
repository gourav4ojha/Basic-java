package classTest;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr1[] = {1,2,3,4,6,8};
        int arr2[] = {0,2,5,7,9};
        int n= arr1.length;
        int m= arr2.length;
        int ans[] = new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m) {
        	if(arr1[i]<arr2[j]) {
        		ans[k++]=arr1[i++];
        	}else {
        		ans[k++]=arr2[j++];
        	}
        }
        while(i<n) {
        	ans[k++]=arr1[i++];
        }
        while(j<m) {
        	ans[k++]=arr2[j++];
        }
        System.out.println(Arrays.toString(ans));
	}

}
