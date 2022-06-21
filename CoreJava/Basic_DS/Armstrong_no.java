package Basic_DS;
import java.util.*;
public class Armstrong_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no you want to check");
		int n = sc.nextInt();
		int temp= n;
		int sum=0;
		while(n!=0) {
			int digit=n%10;
			sum=sum+(digit*digit*digit);
			n=n/10;
			}
		if(sum==temp) 
			System.out.println("Armstrong no");
		else 
			System.out.println("not Armstrong no");
		

}
}
