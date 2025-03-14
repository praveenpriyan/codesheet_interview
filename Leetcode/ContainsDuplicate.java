package Leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/contains-duplicate/

// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

// Input: nums = [1,2,3,1]

// Output: true

// Explanation:
// The element 1 occurs at the indices 0 and 3.
public class ContainsDuplicate {

	public static void main(String[] args) {
		int nums[]= {1,2,3,4};
		boolean flag=false;
		Arrays.sort(nums);
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]==nums[i+1]) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
