package Numbers;

public class AAutomorphicNumber {

	public static void main(String[] args) {
		int n=25;
		int originalNum=n;
		int sqrt=n*n;
		int r=0;
		int digit=0;
		while(n>0) {
			digit++;
			n=n/10;
		}
		System.out.println(digit);		
		
		int sqrtNum=sqrt%(int)Math.pow(10, digit);
		
		if(sqrtNum==originalNum) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}

	}

}
