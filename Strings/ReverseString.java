package Strings;

public class ReverseString {

	public static void main(String[] args) {
		String str="Priyanka";
		String revString="";
		
		for(int i=str.length()-1;i>=0;i--) {
			revString+=str.charAt(i);
		}
		
		System.out.println(revString);
	}

}
