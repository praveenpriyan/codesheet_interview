package Strings;

import java.util.Arrays;

public class FindDuplicates {

	public static void main(String[] args) {
		String str="praveen";
		int c=0;
		char[] charArray =str.toCharArray();
		
		int newIndex=0;
		char[] s= new char[charArray.length];
		
		for(int i=0;i<charArray.length;i++) {
			for(int j=i+1;j<charArray.length;j++) {
				if(charArray[i]==charArray[j]) {
					c++;
					s[newIndex++]=charArray[i];
				}
			}
		}
		char[] duplicates=new char[newIndex];
		for(int k=0; k<newIndex;k++)
		{
			duplicates[k]=s[k];
		}
		System.out.println(Arrays.toString(duplicates));

	}

}
