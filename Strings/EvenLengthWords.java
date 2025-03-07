package Strings;

public class EvenLengthWords {

	public static void main(String[] args) {
		String s="Priya is a cutie girl";
		
		for(String str:s.split(" ")) {
			if(str.length()%2==0) {
				System.out.println(str);
			}
		}
	}

}
