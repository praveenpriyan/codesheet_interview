package Strings;

public class LeadingZeroes {

	public static void main(String[] args) {
		String str="00013";
		String newStr="";
		int i=0;
		while(i<str.length() && str.charAt(i)=='0') {
			
			i++;
		}
	
		for(int j=i;j<str.length();j++) {
			newStr+=str.charAt(j);
		}
		System.out.println(newStr);

	}

}
