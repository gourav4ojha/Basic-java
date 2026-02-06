package practiceLogicalPrograms;
import java.util.*;

public class ArrayIntersection {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int []arr1 = new int[]{5,6,7,3,9};
			int []arr2 = new int[]{3,5,6,7,9,3};
			Set<Integer> set = new HashSet<>();
			for(int i:arr1) {
				set.add(i);
			}
			for(int i:arr2) {
				set.add(i);
			}
			for(int i : set) {
				System.out.print(i);
			}
		

	}

}
