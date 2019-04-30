package day11_logical_operator;

import java.util.Scanner;

public class logIntests {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println(" Enter your Username and Password: ");
	String username, password;

	String validUsername="cybertek@mail.com";
	String validPassword="WoodenSpoon123";
	username=scan.next();
	password=scan.next();
	if(username.equalsIgnoreCase(validUsername)&& password.equals(validPassword)) {
		System.out.println("Welcome!");	
	}else if( !username.equals(validUsername) && password.equals(validPassword)) {
		System.out.println("Invalid Username ");
	}else if( username.equals(validUsername) && !password.equals(validPassword)) {
		System.out.println("Invalid Password");
	}else if( !username.equals(validUsername) && !password.equals(validPassword)) {
		System.out.println("Invalid Username and Password");
		
	}
	
	
	
	
}
}
