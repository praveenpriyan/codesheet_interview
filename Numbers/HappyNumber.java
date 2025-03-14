package Numbers;

public class HappyNumber {

	public static void main(String[] args) {
		int num=31;
		int r=0;
		int sum=0;
	while(num>9) {
		while(num>0) {
			r=num%10;
			sum+=(r*r);
			num=num/10;
		}
		num=sum;
		sum=0;
	}
	if(num==1) {
		System.out.println("HappyNumber");
	}else {
		System.out.println("Not a Happy Number");
	}
	}

}
