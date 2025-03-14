package Leetcode;

// https://leetcode.com/problems/sqrtx/

// Input: x = 4
// Output: 2
// Explanation: The square root of 4 is 2, so we return 2.

public class SquareRootOfNumber {

	public static void main(String[] args) {
		int x=2;
		
		int low=1;
		int high=x;
		
		while(low<=high) {
			int mid=low+(high-low)/2;
			
			if(mid==x/mid) {
				System.out.println(mid);
			}else if(mid<x/mid) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		System.out.println(high);
	}

}
