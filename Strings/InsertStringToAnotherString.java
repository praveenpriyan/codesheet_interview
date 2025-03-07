package Strings;

import java.util.Arrays;

public class InsertStringToAnotherString {

	public static void main(String[] args) {
		String str="Priyanka a cutie";
		String insStr="is";
		int index=8;
		String newStr= " ";
		
		for(int i=0;i<str.length();i++) {
			newStr+=str.charAt(i);
			
			if(i==index) {
				newStr+=insStr;
			}
		}
		System.out.println(newStr);
		
		
	}

}
