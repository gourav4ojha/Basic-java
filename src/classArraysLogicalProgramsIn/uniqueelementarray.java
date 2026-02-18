package classArraysLogicalProgramsIn;

public class uniqueelementarray {
	public static void main(String[] args) {
		int[] arr= {4,2,7,2,5,9};
		//iterate
		for (int i = 0; i < arr.length; i++) {
			boolean duplicate=false;
			//check arr[i] appered before
			for (int j = 0; j <i; j++) {
				if(arr[i]==arr[j])
				{
					duplicate=true;
					break;
				}
			}
			if(!duplicate)
			{
				System.out.print(arr[i]+" ");
			}	
	    }
	}
}
