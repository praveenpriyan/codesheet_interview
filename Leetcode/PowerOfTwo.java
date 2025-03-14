package Leetcode;

// https://leetcode.com/problems/power-of-two/description/

// Input: n = 1
// Output: true
// Explanation: 20 = 1
public class PowerOfTwo {

	public static void main(String[] args) {
		int n=16;
		while(n%2==0) {
			n/=2;
		}
		
		if(n==1) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
