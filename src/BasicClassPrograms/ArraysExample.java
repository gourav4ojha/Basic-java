package BasicClassPrograms;

import java.util.Arrays;

public class ArraysExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {10,60,50,40,5};
		System.out.println("print Array");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("print sorted Array");
		Arrays.sort(arr); // its affecting binary search blow 
		System.out.println(Arrays.toString(arr));
		
		System.out.println("print 2d Array");
		int arr2d[][]= {{2,3},{1,4}};
		System.out.println(Arrays.deepToString(arr2d));
		
		System.out.println("binary search Array");
		// if array is not shorted it will return index but it is not binary search
		System.out.println(Arrays.binarySearch(arr, 10)); // return index on 10
		System.out.println(Arrays.binarySearch(arr, 20)); // return minus value if not found
		System.out.println(Arrays.binarySearch(arr, 10));
		
		System.out.println("Arrays copyof");
		System.out.println(Arrays.toString(Arrays.copyOf(arr, 4)));
		System.out.println(Arrays.toString(Arrays.copyOf(arr, 9))); // add 0 if size > actual array size
		
		System.out.println("Arrays copyof Range");
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 3,7)));
		
		System.out.println("Arrays equals for 1d array only");
		int arr1[]= {10,40,60};
		System.out.println(Arrays.equals(arr, arr1)); // false
		
		System.out.println("Arrays deepequals for 2d array only");
		int arr3[][]= {{10,40},{20,60}};
		System.out.println(Arrays.equals(arr2d, arr3)); // false
		
		System.out.println("Arrays fill");
		Arrays.fill(arr,0,2,2000);
		System.out.println(Arrays.toString(arr)); //[2000,200.40.50.60]
		Arrays.fill(arr, 10000);
		System.out.println(Arrays.toString(arr)); //[10000,10000,10000,10000,10000]
		
		
		
	}

}
