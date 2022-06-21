package Basic_DS;

import java.util.Scanner;

public class Marks_Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int[] A=new int[3];
        int[] B=new int[3];
        int[] C=new int[3];
        System.out.println("for student A");
        
        	System.out.println("enter value for 1st subject");
        	A[0]=sc.nextInt();
        	System.out.println("enter value for 2nd subject");
        	A[1]=sc.nextInt();
        	System.out.println("enter value for 3rd subject");
        	A[2]=sc.nextInt();
        	
        	int TotalA =A[0]+A[1]+A[2];
        	float avgA=(TotalA)/3;
        	System.out.println("total is = "+TotalA+"Avg is ="+avgA);
        	
        	System.out.println("for student B");
            
        	System.out.println("enter value for 1st subject");
        	B[0]=sc.nextInt();
        	System.out.println("enter value for 2nd subject");
        	B[1]=sc.nextInt();
        	System.out.println("enter value for 3rd subject");
        	B[2]=sc.nextInt();
        	
        	int TotalB =B[0]+B[1]+B[2];
        	float avgB=(TotalB)/3;
        	System.out.println("total is = "+TotalB+"Avg is ="+avgB);
        	
        	System.out.println("for student C");
            
        	System.out.println("enter value for 1st subject");
        	C[0]=sc.nextInt();
        	System.out.println("enter value for 2nd subject");
        	C[1]=sc.nextInt();
        	System.out.println("enter value for 3rd subject");
        	C[2]=sc.nextInt();
        	
        	int TotalC =C[0]+C[1]+C[2];
        	float avgC=(TotalC)/3;
        	System.out.println("total is = "+TotalC+"Avg is ="+avgC);
        	
        	
        
	}

}
