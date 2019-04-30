package day08_scanner;

import java.util.Scanner;

public class GradeCheck {
public static void main(String[] args) {
	//A, B, C,D
	//char grade=scan.next().charAt(0);
//if grade 'A'=>Excellent job!Keep it up!
	//else
	//how many points did you miss for 'A'?
	// int point-  from scanner
	//print "You grade B is not good enough. You could earn 10 more points if you studied harder."
	
	
	Scanner scan= new Scanner(System.in);
	System.out.println("Whats your grade?");
	char grade= scan.next().charAt(0);
	if(grade == 'A') {
	System.out.println("Excellent job!Keep it up!");
	}else{
		System.out.println("how many points did you miss for 'A'?");
		int point= scan.nextInt();
		System.out.println("you could earn " +point+ " more points if you studied harder. ");
		
		
		
	}
	
	
}
}
