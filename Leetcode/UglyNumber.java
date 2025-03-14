package Leetcode;

// https://leetcode.com/problems/ugly-number/description/

// An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5.

// Input: n = 14
// Output: false
// Explanation: 14 is not ugly since it includes the prime factor 7.
public class UglyNumber {

	public static void main(String[] args) {
		int n=14;
		
		if(n<0) {
			System.out.println("false");
			}
		
		if(n>1) {
			while(n%2==0) {
				
				n/=2;
			}
			while(n%3==0) {
				
				n/=3;
			}
			while(n%5==0) {
				
				n/=5;
			}
		}
		if(n==1) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
