package Leetcode;


// https://leetcode.com/problems/contains-duplicate-ii/

// Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

// Input: nums = [1,2,3,1], k = 3
// Output: true
public class ContainsDuplicateII {

	public static void main(String[] args) {
		int[] nums= {1,2,3,1,2,3};
		int k=2;
		boolean flag=false;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j] && Math.abs(i-j)<=k) {
					flag=true;
					break;
				}
			}
			
		}
		if(flag) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
