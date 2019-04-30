package day_18_loop;

import java.util.Scanner;

public class enterpincode {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int secretPincode=568;
	int pincode=0;
	
	while(pincode!=secretPincode) {
		System.out.println("Enter your pincode");
		pincode=scan.nextInt();
		
	}
	System.out.println("correct");
}
}
