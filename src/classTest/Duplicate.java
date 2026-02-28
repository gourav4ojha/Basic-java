package classTest;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {3,6,8,9,3,4,6,2};
        
        for(int i=0; i<arr.length; i++) {
        	for(int j=i+1; j<arr.length; j++) {
        		if(arr[i]==arr[j]) {
        			System.out.println(arr[i]);
        			break;
        		}
        	}
        }
	}

}
