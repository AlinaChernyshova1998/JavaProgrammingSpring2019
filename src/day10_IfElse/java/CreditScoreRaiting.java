package day10_IfElse.java;

import java.util.Scanner;

public class CreditScoreRaiting {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your Credir Score: ");
	int creditScore=scan.nextInt();
	//excellent => 750-850
	if(creditScore>=750 && creditScore<=850) {
		System.out.println("Excellent!");
		
	}else if(creditScore>=700 && creditScore<=740) {
		System.out.println("Good!");
	}else if(creditScore>=650 && creditScore<=699) {
		System.out.println("Fair!");
	}else if(creditScore>=550 && creditScore<=649) {
		System.out.println("Poor!");
	}else if(creditScore>= 0 && creditScore<=549) {
		System.out.println("Bad!");
	}else{
		System.out.println("Invalid score");
	}
		
	}
}
