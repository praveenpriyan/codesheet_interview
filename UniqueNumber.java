package Numbers;

public class UniqueNumber {

	public static void main(String[] args) {
		int num1=1234;
		int num2=num1;
		int r1,r2,c=0;
		while(num1>0) {
			r1=num1%10;
			while(num2>0) {
				r2=num2%10;
				
				if(r1==r2) {
					c++;
				}
				num2/=10;
			}
			num1/=10;
			
		}
		if(c==1) {
			System.out.println("Unique Number");
		}else {
			System.out.println("Not a unique Number");
		}

	}

}
