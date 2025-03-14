package Leetcode;

// https://leetcode.com/problems/valid-perfect-square/

// A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself. 

// Example 1:

// Input: num = 16
// Output: true
// Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
public class ValidPerfectSquare {

	public static void main(String[] args) {
		
		int num=16;
		
		for(int i=1;i<=num/i;i++) {
			if(i*i==num) {
				System.out.println("Perfect square"+i);
			}
		}
		
	}

}
