package classArraysLogicalProgramsIn;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] list1 = {1, 2, 4,5};
        int[] list2 = {1, 3, 4,6};

        int i = 0, j = 0;
        int[] result = new int[list1.length + list2.length];
        int k = 0;

        while (i < list1.length && j < list2.length) {
            if (list1[i] <= list2[j]) {
                result[k++] = list1[i++];
            } else {
                result[k++] = list2[j++];
            }
        }
//
        
        
        while (j < list2.length) {
            result[k++] = list2[j++];
        }

        // print result
        for (int num : result) {
            System.out.print(num + " ");
        }
	}
}


	      