package day_19_transaction;

import java.util.Scanner;

public class transaction2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your balance:");
	double balance=scan.nextDouble();
	int count=0;
	while(balance>0) {
		count++;//increase transaction by 1
		System.out.println("What is transaction # " +count+" amount");
		double transaction=scan.nextDouble();
		if(transaction>balance) {
			System.out.println("Your balance is above to be negative");
		}
		balance-=transaction;
		System.out.println("Current amount: "+balance);
			
	}
	System.out.println("You have insufficient funds for any more trandsaction, your balance is: "+balance);
     System.out.println("Transactions total count: "+count);
}
}

