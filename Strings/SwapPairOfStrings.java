package Strings;

public class SwapPairOfStrings {

	public static void main(String[] args) {
		String str="java";
		
		char[] ch=str.toCharArray();
		
		for(int i=0;i<str.length();i+=2) {
			char temp=ch[i];
			ch[i]=ch[i+1];
			ch[i+1]=temp;
		}
		System.out.println(ch);

	}

}
