package Strings;

public class ReplaceCharacter {

	public static void main(String[] args) {
		String str="priyanka";
		int index=3;
		String newStr="";
		char[] ch1=str.toCharArray();
		char ch='z';
		System.out.println(str.length());
		for(int i=0;i<ch1.length;i++) {
			if(i==index) {
				newStr+=ch;
			}else {
				newStr+=ch1[i];
			}
		}
		System.out.println(newStr);
	}

}
