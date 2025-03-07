package Numbers;

public class NeonNumber {

	public static void main(String[] args) {
		int num=9;
		int r=0,sum=0;
		int sqrt=(num*num);
		while(sqrt>0) {
			r=sqrt%10;
			sum=sum+r;
			sqrt/=10;
			
		
		}
		
		if(num==sum) {
			System.out.println("Neon Number");
		}else {
			System.out.println("Not a Neon Number");
		}
	}

}
