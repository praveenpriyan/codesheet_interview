package Leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/merge-sorted-array/

// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1= {1,2,3,0,0,0};
		int m=3;
		int[] nums2 = {2,5,6};
		int n=3;
		
		 int index = m; 
	        for (int j = 0; j < n; j++) {
	            nums1[index++] = nums2[j];
	        }
	    
	        Arrays.sort(nums1, 0, m + n);
	    
	        System.out.println(Arrays.toString(nums1));

	}
	

}
