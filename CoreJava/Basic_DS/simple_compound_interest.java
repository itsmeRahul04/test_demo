package Basic_DS;

import java.util.*;

public class simple_compound_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the principal");
		double principal=sc.nextDouble();
		System.out.println("Enter the rate");
		double rate=sc.nextDouble();
		System.out.println("Enter the time");
		double time=sc.nextDouble();
		
		
		double simple_interest=(principal*time*rate)/100;
		System.out.println("Simple interest is = "+simple_interest);
		
		double compound_interest=principal*Math.pow((1+rate/100),time);
		compound_interest=compound_interest-principal;
		System.out.println("compound interest is ="+compound_interest);
		
		
	}

}
