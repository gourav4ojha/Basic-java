package classTest;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int k = 5;
        int start =0;
        int end = arr.length;
        
        while(start<end) {
        	int mid = start +(end-start)/2;
        	if(k==arr[mid]) {
        		System.out.println(mid);
        		break;
        	}
        	else if(k<arr[mid]) end =mid-1;
        	else start = mid+1;
        }
	}

}
