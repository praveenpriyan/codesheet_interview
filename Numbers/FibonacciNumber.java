package Numbers;

public class FibonacciNumber {

	public static void main(String[] args) {
		int num=10;
		int f1=0;
		int f2=1;
		int f3=0;
		
		for(int i=0;i<num;i++) {
			f3=f1+f2;
		f1=f2;
		f2=f3;
		System.out.println(f3);
		}

	}

}
