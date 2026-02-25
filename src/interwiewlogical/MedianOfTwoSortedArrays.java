package interwiewlogical;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Solution {
	    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int arr[] = new int[nums1.length+nums2.length];
	        int i=0;
	        int j=0;
	        int k=0;
	        while(j<nums1.length && k<nums2.length){
	            if(nums1[j] <= nums2[k]) arr[i++] = nums1[j++];
	            else arr[i++] = nums2[k++];
	        }
	        while(j<nums1.length){
	            arr[i++] = nums1[j++];
	        }
	        while(k<nums2.length){
	            arr[i++] = nums2[k++];
	        }
	        int mid = arr.length/2 ;
	        if (arr.length % 2 == 0)
	            return (arr[mid] + arr[mid - 1]) / 2.0;
	        else
	            return arr[mid];
	    }
	}

}
