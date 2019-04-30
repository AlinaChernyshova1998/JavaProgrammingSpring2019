package day08_scanner;

import java.util.Scanner;

public class Time {
	public static void main(String[] args) {
	    //WRITE YOUR CODE HERE:
	    Scanner scan= new Scanner(System.in);
	    System.out.println("Enter number of milligrams in drink: ");
	    int ourMilligrams, lethalDose,milligramskiller=10000;
	    ourMilligrams=scan.nextInt();
	    lethalDose=milligramskiller/ourMilligrams;
	    System.out.println("It would take about "+lethalDose+" drinks a lethal overdose");
	    
	    
	    
	    
	    
	  }
	}
		   
