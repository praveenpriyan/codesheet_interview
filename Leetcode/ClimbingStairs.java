package Leetcode;

// https://leetcode.com/problems/climbing-stairs/description/

// Input: n = 2
// Output: 2
// Explanation: There are two ways to climb to the top.
// 1. 1 step + 1 step
// 2. 2 steps

public class ClimbingStairs {

	public static void main(String[] args) {
		int n=5;
		
		int first=1,second=2;
		if(n<2) {
			System.out.println(n);
		}
		for(int i=3;i<=n;i++) {
			int third=first+second;
			first=second;
			second=third;
		}
		System.out.println(second);

	}

}
