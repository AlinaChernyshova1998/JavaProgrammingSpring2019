package day08_scanner;

import java.util.Scanner;

public class VotingEligibility {
public static void main(String[] args) {
	/* program to tell if you are eligble to vote. 
	 voitingAge=18
	 YourAge=take from scanner
	 if you are eligble to vote:
	 you are eligble to vote for 3 years
	 else
	 you are not eligble to vote
	 you still have 3 more years to go
	 */
	
	Scanner scan= new Scanner(System.in);
	int voitingAge=18;
	System.out.println("What's your age?");
	int yourAge=scan.nextInt();
	int years=yourAge - voitingAge;
	if(yourAge>=voitingAge) {
		
		
		System.out.println("you are eligble to vote.");
	}else{
		System.out.println("you still have more "+years+" to go.");
	}

	
} 
	
}

