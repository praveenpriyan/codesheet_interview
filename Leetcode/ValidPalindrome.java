package Leetcode;


// https://leetcode.com/problems/valid-palindrome/description/
// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.


public class ValidPalindrome {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		
		String regex= "[,\\:\\-\\s.@#$!%&*?``;_\\[\\]{}()/\"'\\\\]";
		String rev="";
		
		
		for(String str:s.split(regex)) {
			rev+=str;
			
		}
		String originalStr=rev.toLowerCase();
		String res="";
		
		for(int i=originalStr.length()-1;i>=0;i--) {
			res+=originalStr.charAt(i);
		}
		
		if(originalStr.equals(res)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
