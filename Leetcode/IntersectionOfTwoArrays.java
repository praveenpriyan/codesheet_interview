package Leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/intersection-of-two-arrays/description/

// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]
public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		int[] nums1= {1,2,2,1};
		int[] nums2= {2,2};
		
		Set<Integer> set1=new HashSet<>();
		
		for(int s:nums1) {
			set1.add(s);
		}
		System.out.println(set1);
		
		Set<Integer> intersection = new HashSet<>();
		
		for(int num : nums2) {
			if(set1.contains(num)) {
				intersection.add(num);
			}
		}
		System.out.println(intersection);
		
		int[] result=new int[intersection.size()];
		int index=0;
		
		for(int res:intersection) {
			result[index++]=res;
		}
		System.out.println(Arrays.toString(result));
		

	}

}
