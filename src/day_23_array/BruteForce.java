package day_23_array;
import java.util.Scanner;
public class BruteForce {
public static void main(String [] args) {
	Scanner scan= new Scanner(System.in);
	String exspecteduserName="admin";
	String excpectedpassword="admin123";
	String username="";
	String password="";
	int attempts=5;
	do {
		if(attempts==0) {
			System.out.println("You have exceeded number at attempts");	
			System.out.println("This user has been deactivated");
			return;
		}
		attempts--;
		System.out.println("Enter username: ");
		username=scan.next();
		if(!username.equals(exspecteduserName)) {
			System.out.println("Wrong username");
			System.out.println("Attempts left "+attempts);
			continue;	
		}
		System.out.println("Enter password: ");
		password=scan.next();
		if(!password.equals(excpectedpassword)){
	    System.out.println("Wrong password");
	    System.out.println("Attempts left "+attempts);
	    
		}
	}while(!username.equals(exspecteduserName) || !password.equals(excpectedpassword));
	System.out.println("Login successfull");
	
}
}
