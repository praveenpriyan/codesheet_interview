package Leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/majority-element/

// Input: nums = [3,2,3]
// Output: 3

public class MajorityElement {

	public static void main(String[] args) {
		
		int[] nums= {2,2,1,1,1,2,2};
		Arrays.sort(nums);
		int n=nums.length;
		
		System.out.println(nums[n/2]);

	}

}
