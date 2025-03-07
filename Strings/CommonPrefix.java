package Strings;

import java.util.Arrays;

public class CommonPrefix {

	public static void main(String[] args) {
		String[] str= {"flower","flight","flow"};
		
		Arrays.sort(str);
		String res="";
		String s=str[0];
		String str2=str[str.length-1];
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==str2.charAt(i)) {
				res+=s.charAt(i);
			}
			
		}
		System.out.println(res);
		
		

	}

}
