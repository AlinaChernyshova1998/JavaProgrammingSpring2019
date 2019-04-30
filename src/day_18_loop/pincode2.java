package day_18_loop;

import java.util.Scanner;

public class pincode2 {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	int secretpincode=4536;
	int pincode=0;
	int attempts=0;
	while (pincode!=secretpincode && attempts<=3) {
	System.out.println("Enter pincode:");
	pincode=scan.nextInt();
	attempts++;
	
	if(attempts==3 && pincode!=secretpincode) {
		System.out.println("Card block"); 
		return;
	
	}	
	}
	System.out.println("Correct");

	
}
}