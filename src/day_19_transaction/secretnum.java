package day_19_transaction;

import java.util.Random;
import java.util.Scanner;

public class secretnum {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	Random random=new Random();
	int secretnum=random.nextInt(100);
	int guessnum;
	do {
		System.out.println("Guess a number:");
	guessnum=scan.nextInt();
	if(guessnum<secretnum) {
		System.out.println("Your number is too small!");
	}else if (guessnum>secretnum) {
		System.out.println("Your number is too large!");
	}
	}while(guessnum!=secretnum);
	System.out.println("Good job, you get it");
	}
}
