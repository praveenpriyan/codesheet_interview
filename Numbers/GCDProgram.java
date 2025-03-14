package Numbers;

public class GCDProgram {

	public static void main(String[] args) {
		int no1=15,no2=18;
		
		int min= no1<no2 ?no1:no2;
		while(min>=2) {
		if((no1%min==0) && (no2%min==0)) {
			System.out.println(min);
			break;
		}else {
			min--;
		}
		}

	}

}
