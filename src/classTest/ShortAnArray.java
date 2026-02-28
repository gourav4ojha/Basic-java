package classTest;
import java.util.*;

public class ShortAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {4,7,9,3,8,1};
       for(int i=0; i<arr.length; i++) {
    	   for(int j=i+1; j<arr.length; j++) {
    		   if(arr[i]>arr[j]) {
    			   int temp = arr[i];
    			   arr[i] = arr[j];
    			   arr[j] = temp;
    		   }
    	   }
       }
       System.out.print(Arrays.toString(arr));
	}
}
