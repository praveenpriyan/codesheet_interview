package Leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/missing-number/

// Input: nums = []
// Output: 2
public class MissingNumber {

	public static void main(String[] args) {
		int[] nums= {3,0,1};
		
		System.out.println(missing(nums));
		
	}
	public static int missing(int[] nums) {
		Arrays.sort(nums);
		int n=nums.length;
		for(int i=0;i<n;i++) {
			if(i!=nums[i]) {
				return i;
			}
		}

		return n;
	}

}
