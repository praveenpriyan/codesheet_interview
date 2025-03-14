package Leetcode;

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.

public class IndexOfFirstOccurences {

	public static void main(String[] args) {
		String haystack = "leetcode";
		String needle = "leeto";
		
		System.out.println(strStr(haystack,needle));
		
	}
	 public static int strStr(String haystack, String needle) {
	        if (needle.isEmpty()) return 0;
	        if (haystack.length() < needle.length()) return -1;

	        char[] c1 = haystack.toCharArray();
	        char[] c2 = needle.toCharArray();

	        for (int i = 0; i <= c1.length - c2.length; i++) {
	            int j;
	            for (j = 0; j < c2.length; j++) {
	                if (c1[i + j] != c2[j]) {
	                    break;
	                }
	            }
	            if (j == c2.length) {
	                return i;
	            }
	        }
	        return -1;
	    }
}
