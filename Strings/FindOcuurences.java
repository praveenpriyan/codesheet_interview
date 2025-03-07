package Strings;

public class FindOcuurences {

	public static void main(String[] args) {
		String str= "praveen";
		char ch='e';
		int c =0;
		char[] charArray=str.toCharArray();
		
		for(int i=0;i<charArray.length;i++) {
			if(charArray[i]==ch) {
				c++;
			}
		}
		System.out.println(c);

	}

}
