package Leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/reverse-vowels-of-a-string/

// Input: s = "IceCreAm"
// Output: "AceCreIm"
// Explanation:
// The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
public class ReverseVowelsOfstring {

	public static void main(String[] args) {
		String s="IceCreAm";
		 int index=0;
	        char[] str=new char[s.length()];
	        char[] ch=s.toCharArray();
	        for(int i=0;i<ch.length;i++){
	              if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U' ){
	                str[index++]=ch[i];
	            }
	        }
	       
	        char[] str1=new char[index];
	        for(int i=0;i<index;i++){
	            str1[i]=str[i];
	        }
	        
	         char[] str2=new char[index];

	         int in=0;
	         for(int i=str1.length-1;i>=0;i--){
	            str2[in++]=str1[i];
	         }
	           System.out.println(Arrays.toString(str2));

	           char[] ch2=new char[ch.length];
	            int vowelIndex = 0;
	           for(int i=0;i<ch.length;i++){
	             if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U' ){
	                 ch[i] = str2[vowelIndex++];
	             }
	           }
	           System.out.println(Arrays.toString(ch));
	            
	            String res=String.valueOf(ch);

	        System.out.println(res);

	}

}
