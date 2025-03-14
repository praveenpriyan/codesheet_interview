package Leetcode;

// https://leetcode.com/problems/add-digits/description/
// Input: num = 38
// Output: 2
// Explanation: The process is
// 38 --> 3 + 8 --> 11
// 11 --> 1 + 1 --> 2 
// Since 2 has only one digit, return it.
public class AddDigits {

	public static void main(String[] args) {
		int num=38;
		int r,sum=0;
		
		while(num>9) {
			while(num>0) {
				r=num%10;
				sum+=r;
				num/=10;
			}
			num=sum;
			sum=0;
		}
		System.out.println(num);

	}

}
