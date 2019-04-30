package day_19_transaction;

import java.util.Scanner;

public class enterpassword {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String password="abc123";
	String input;
	do {
		System.out.println("Enter password:");
		input=scan.next();
	}while(!input.equals(password));
}
}
