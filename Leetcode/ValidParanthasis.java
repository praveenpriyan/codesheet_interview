package Leetcode;


// https://leetcode.com/problems/valid-parentheses/description/

//Input: s = "()"
//Output: true
//Example 2:
//Input: s = "()[]{}"
//Output: true

import java.util.Stack;

public class ValidParanthasis {

	public static void main(String[] args) {
		String s =  "()[]{}";
		
		Stack<Character> stack=new Stack<>();
		
		for(char c:s.toCharArray()) {
			if(c=='(' || c=='[' || c=='{') {
				stack.push(c);
			}else {
				char top=stack.pop();
				
				if((c==')' && top=='(') || (c==']' && top=='[') || (c=='}' && top=='{')) {
					System.out.println("true");
				}else {
					System.out.println("false");
				}
			}
		}
		stack.isEmpty();
		
		

	}

}
