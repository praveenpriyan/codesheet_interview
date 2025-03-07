package Strings;

import java.util.Arrays;

public class FindUniqueCharacters {

	public static void main(String[] args) {
		String str="praveen";
		char[] ch=str.toCharArray();
		int index=0;
		char[] newStr=new char[ch.length]; 

		  for (int i = 0; i < str.length(); i++) {
	            boolean isUnique = true;
	            for (int j = 0; j < str.length(); j++) {
	                if (i != j && ch[i] == ch[j]) {
	                    isUnique = false;
	                    break;
	                }
	            }
	            if (isUnique) {
	                newStr[index++] = ch[i];
	            }
	        }
		  
		  char[] uniques=new char[index];
		for(int k=0;k<index;k++) {
			uniques[k]=newStr[k];
		}
		System.out.println(Arrays.toString(uniques));

	}

}
