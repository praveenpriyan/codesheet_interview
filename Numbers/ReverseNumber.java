package Numbers;

public class ReverseNumber {

	public static void main(String[] args) {
		int num=124;
		int rev=0,r;
		
		while(num>0) {
			r=num%10;
			rev=(rev*10)+r;
			num/=10;
		}
		System.out.println(rev);

	}

}
