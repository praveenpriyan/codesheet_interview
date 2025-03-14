package Numbers;

public class TraillingNumbers {

	public static void main(String[] args) {
		int num=90;
		int r,sum=0;
		boolean flag=true;
		
		while(num>0) {
			r=num%10;
			if(r==0) {
				flag =false;
			}
			sum=(sum*10)+r;
			num/=10;
		}
		System.out.println(sum);
		

	}

}
