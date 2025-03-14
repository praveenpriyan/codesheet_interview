package Numbers;

public class PalindromeNumber {
	public static void main(String[] args) {
		int num=121;
		
		int n=num;
		int rev=0;
		int r=0;
		
		while(num>0) {
			r=num%10;
			rev=(rev*10)+r;
			num=num/10;
		}
		System.out.println(rev);
		if(n==rev) {
			System.out.println("Palindrome Number");
		}else {
			System.out.println("Not a Palindrome Number");
		}
	}
}
