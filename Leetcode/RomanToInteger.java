package Leetcode;

// https://leetcode.com/problems/roman-to-integer/

// Input: s = "III"
// Output: 3
// Explanation: III = 3.

import java.util.HashMap;

public class RomanToInteger {

	public static void main(String[] args) {
		String s="III";
		
		HashMap<Character,Integer> map=new HashMap<>();
		
		map.put('I',1);
		map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int len=s.length();
        int result=map.get(s.charAt(len-1));
        for(int i=len-2;i>=0;i--) {
        	if(map.get(s.charAt(i))>=map.get(s.charAt(i+1))) {
        		result+=map.get(s.charAt(i));
        	}else {
        		result-=map.get(s.charAt(i));
        	}
        }
		System.out.println(result);
	}

}
