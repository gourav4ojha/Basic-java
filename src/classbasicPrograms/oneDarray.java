package classbasicPrograms;

import java.util.Iterator;

public class oneDarray {

	public static void main(String[] args) {
// method 1 to create
		
		int arr[]= {10,20,30,40,50};
        //System.out.println(arr[0]);  // 10
        //System.out.println(arr[9]); // error array index out of bound
        //write for and then use keys control+space
		System.out.println("first array");
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
//method 2 to create
	   int arr2[];
	   arr2 = new int[] {10,20,30};
	   System.out.println(arr2[2]);
	   System.out.println("second array");
	   for(int n:arr2) {
		   System.out.println(n);
	   }
	   
//method 3 with new keyword	   
	   int arr3[]=new int[5];
	   arr3[0]=10;
	   arr3[1]=20;
	   arr3[3]=40;
	   arr3[4]=50;
	   System.out.println("third array");
	   for (int i = 0; i < arr3.length; i++) {
		   System.out.println(arr3[i]);
	}

	}

}
