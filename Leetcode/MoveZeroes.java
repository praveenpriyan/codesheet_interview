package Leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/move-zeroes/description/

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]

public class MoveZeroes {

	public static void main(String[] args) {
		int[] nums= {0,1,0,3,12};
		
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==0 && nums[j]!=0) {
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));

	}

}
