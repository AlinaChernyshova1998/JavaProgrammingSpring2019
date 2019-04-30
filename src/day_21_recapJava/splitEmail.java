package day_21_recapJava;

import java.util.Scanner;

public class splitEmail {
	  public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    String email = input.nextLine();
		   
		    //Write your code below
		    if(!email.contains("@")){
		      System.out.println("invalid email");
		      return;
		    }
		    else if(email.contains("@")){
		    	String id=email.substring(0, email.indexOf("@"));
			    String domain=email.substring(email.indexOf("@")+1);
		      System.out.println("Email id: "+id);
		        System.out.println("Email domain: "+domain); 
		    }
		  }
		
}
