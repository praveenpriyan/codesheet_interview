package Leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/single-number

// Input: nums = [2,2,1]

// Output: 1

public class SingleNumber {

	public static void main(String[] args) {
		int[] nums= {4,1,2,1,2};
		int[] newArr=new int[nums.length];
		int index=0;
		for(int i=0;i<nums.length;i++) {
			boolean found=true;
			for(int j=0;j<nums.length;j++) {
				if(i!=j && nums[i]==nums[j]) {
					found=false;
					break;
				}
			}
			if(found) {
				newArr[index++]=nums[i];
			}
			
		}
		System.out.println(Arrays.toString(newArr));
		Arrays.sort(newArr);
		int val=newArr[newArr.length-1];
		System.out.println(val);

	}

}
