package interwiewlogical;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class Solution {
	    public int search(int[] nums, int target) {

	        for(int i=0; i<nums.length; i++){
	            if(nums[i] == target) return i;
	        }
	        return -1;
	    }
	}
}
