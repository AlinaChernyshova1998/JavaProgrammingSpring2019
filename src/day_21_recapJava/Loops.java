package day_21_recapJava;

import java.util.Scanner;

public class Loops {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int number1;
	int number2;
	int sum=0;
	do {
		System.out.println("Enter 1 number:");
		number1=scan.nextInt();
		System.out.println("Enter 2 number:");
		 number2=scan.nextInt();
		 sum=number1+number2;
	
	}while(sum<=100) ;
		System.out.println("Good number!");
	}
	
	}
