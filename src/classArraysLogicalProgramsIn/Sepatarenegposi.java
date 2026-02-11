package classArraysLogicalProgramsIn;

public class Sepatarenegposi {
	public static void main(String[] args) {
		int[] arr= {5,-3,7,-1,0,-6,4};
		//step1 iterate array elem
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<0)
			{
				System.out.print(arr[i]+" ");	
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>=0)
			{
				System.out.print(arr[i]+" ");
			}	
		}
	}

}
