package classArraysLogicalProgramsIn;

public class twosumarray {
	public static void main(String[] args) {
		int[] arr= {2,7,11,15};
		int target=17;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j]==target)
				{
					System.out.print(i+" ");
					System.out.print(j);
					
				}
			}
			
			
		}
	}

}
