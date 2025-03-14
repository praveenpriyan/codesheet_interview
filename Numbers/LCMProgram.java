package Numbers;

public class LCMProgram {

	public static void main(String[] args) {
		int no1=10,no2=25;
		
		int max=(no1>no2)? no1:no2;
		
		while(true) {
			if(max%no1==0 && max%no2==0) {
				System.out.println(max);
				break;
			}else {
				++max;
			}
		}
	}

}
