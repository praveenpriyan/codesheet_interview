package Numbers;

public class MultiplyDigit {

	public static void main(String[] args) {
		int num=1234;
		int r=0;
		int sum=1;
		
		while(num>0) {
			r=num%10;
			sum=sum*r;
			num=num/10;
		}
		System.out.println(sum);

	}

}
