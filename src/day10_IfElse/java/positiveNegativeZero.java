package day10_IfElse.java;

import java.util.Scanner;

public class positiveNegativeZero {
public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	    System.out.println("Enter a number:");
	    int number = input.nextInt();
	   
	    //CODE HERE 
	    if(number>=1){
	      System.out.println(number+" is positive");
	    }else if(number<0){
	     System.out.println(number+" is negative"); 
	     }else if (number==0){
	       System.out.println("it is zero");
	     }
	    }
	    
}
