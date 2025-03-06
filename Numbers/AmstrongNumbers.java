package Numbers;

public class AmstrongNumbers {
	public static void main(String[] args) {
		int num=1634;
		int number=num;
		int originalNum=num;
		int digit=0,r;
		while(num>0) {
			r=num%10;
			digit++;
			num=num/10;
		}
		System.out.println(digit);
		
		
		int val=0;
		int x=0;
		while(number>0) {
			r=number%10;
			val=val+(int)(Math.pow(r, digit));
			number=number/10;
		}
		System.out.println(val);
		
		if(originalNum==val) {
			System.out.println("Amstrong Number");
		}else {
			System.out.println("Not an Amstrong Number");
		}
	}

}
