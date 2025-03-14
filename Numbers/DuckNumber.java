package Numbers;

public class DuckNumber {
	public static void main(String[] args) {
		int num=03210;
		int r=0;
		boolean flag=false;
		while(num>0) {
		r=num%10;
		//System.out.println(r);
		if(r==0) {
		 flag=true;
		}
		
		num=num/10;
		}
		if(flag) {
			System.out.println("Duck Number");
		}else {
			System.out.println("Not Duck Number");
		}
	}

}
