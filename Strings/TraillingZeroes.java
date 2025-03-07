package Strings;

public class TraillingZeroes {

	public static void main(String[] args) {
		String str="123400";
		String newStr="";
		
		int i=str.length()-1;
		while(i>=0 && str.charAt(i)=='0') {
			i--;
		}
		for(int j=0;j<=i;j++) {
			newStr+=str.charAt(j);
		}
		//System.out.println(str.substring(0,i+1));
		System.out.println(newStr);
	}

}
