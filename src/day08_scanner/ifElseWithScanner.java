package day08_scanner;

import java.util.Scanner;

public class ifElseWithScanner {
public static void main(String[] args) {
	//passingPercentage=65;
	//yourScorePercentage=take from scanner
	//check if you pass or failed
	
	Scanner scan=new Scanner(System.in);
	int passingPercentage=65;
	System.out.println("What is your score?");
	int yourScore= scan.nextInt();
	if(yourScore>=passingPercentage) {
		System.out.println("You passed");
	}else{
		System.out.println("You failed");
	
	
	System.out.println("Java is fun");
	}	
}
}
