package BasicClassPrograms;

import java.util.Arrays;

public class Nonprimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("welcome");
		System.out.println(str);
		double [] arr = {10,30.6,40};
		for(double i: arr) {
			System.out.println(i);
		}
		System.out.println(arr); // will give object
		System.out.println(Arrays.toString(arr));

	}

}
