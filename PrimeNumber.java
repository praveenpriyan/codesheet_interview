package Numbers;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=18;
		if(num>0) {
			if(isPrime(num)) {
				System.out.println(num);
			}else {
				System.out.println("Not a primenumber");
			}
			
		}

	}
	public static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
	
	return true;
	}
}
