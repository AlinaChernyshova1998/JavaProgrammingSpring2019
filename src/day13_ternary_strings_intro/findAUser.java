package day13_ternary_strings_intro;

import java.util.Scanner;

public class findAUser {
	  public static void main(String[] args) {
		  String fullName;
		    Scanner scan = new Scanner(System.in);
		    //WRITE YOUR CODE HERE 
		    
		    System.out.println("Enter full name:");
		   fullName= scan.nextLine();
		 if(fullName.equalsIgnoreCase("Max Payne")) {
			 System.out.println("User found");
			 
		 }else if (fullName.equalsIgnoreCase("Alan Wake")) {
			 System.out.println("User found");
		 }else{
			 System.out.println("User not found");
		 }
			  
		  }
		
}
