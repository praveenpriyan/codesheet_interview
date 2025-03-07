package Strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="silent";
		String s2="listen";
		
		boolean flag=true;
		
		int n1=s1.length();
		int n2=s1.length();
		
		if(n1!=n2) {
			flag=false;
		}

		
		char[] str1=s1.toCharArray();
		char[] str2 =s2.toCharArray();
		System.out.println(Arrays.toString(str1));
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		for(int i=0;i<s1.length();i++) {
			if(str1[i]!=str2[i]) {
				flag=false;
				break;
			}
		}
		if(flag) {
		System.out.println("Anagrams");
	}else {
		System.out.println("not");
	}
		
	}

}
