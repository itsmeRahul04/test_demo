package Basic_DS;

import java.util.*;

public class check_user_password {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String username="Rahul0406";
		String password="987654321";
		int count= 3;
		for(int i=0;i<4;i++) {
			
			if(count>0) {
				System.out.print("Please Enter username = ");
				String Enterusername=sc.nextLine();
				System.out.print("Please Enter password = ");

				String Enterpassword=sc.nextLine();
				if(Enterusername.equals(username) && Enterpassword.equals(password)) {
					System.out.println("Welcome");
					break;
				}
				else {
					System.out.println("Wrong username or password");
					
					count--;
					
				}
			}
			else {
				System.out.println("Contact Admin");
				break;
			}
		
		}
	
		
		
	}

}
