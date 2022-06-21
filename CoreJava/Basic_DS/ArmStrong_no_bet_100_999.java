package Basic_DS;

public class ArmStrong_no_bet_100_999 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		for(int start=100, end=999;start<=end;start++) {
			int n=start;
			int temp=n;
			int sum=0;
			while(n!=0) {
				int digit=n%10;
				sum=sum+(digit*digit*digit);
				n=n/10;
			}
			if(sum==temp) {
				System.out.println("Armstrong no= "+temp);
			}
		
		}

	}

}
