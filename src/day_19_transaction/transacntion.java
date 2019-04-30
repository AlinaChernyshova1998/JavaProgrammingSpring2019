package day_19_transaction;

import java.util.Scanner;

public class transacntion {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("What is your balance?");
	double balance=scan.nextDouble();
	while(balance>0) {
	System.out.println("What is transaction amount?");
	double transaction=scan.nextDouble();
	balance-=transaction;
	
	}
	System.out.println("Not enough balance on your account, your balance is:"+balance);
}
}
