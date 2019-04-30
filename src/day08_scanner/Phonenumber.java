package day08_scanner;

import java.util.Scanner;

public class Phonenumber {
	
	 public static void main(String[] args){
		  
		 Scanner scan= new Scanner(System.in);
		    System.out.println("Welcome to the patient portal!");
		    System.out.println("Please enter your personal information");
		    String firstName, lastName, fullName, email, street, state, city, address, contacts;
		    int age, zipcode;
		    double height, weight;
		    boolean isMarried;
		    long workPhoneNumber, personalPhoneNumber;
		    firstName=scan.next();
		    System.out.println("Enter your first name");
		    lastName=scan.next();
		    System.out.println("Enter your last name");
		    email=scan.next();
		    System.out.println("Enter your email");
		    street=scan.next();
		    System.out.println("Enter your street");
		    city=scan.next();
		    System.out.println("Enter your city");
		    state=scan.next();
		    System.out.println("Enter your state");
		    zipcode=scan.nextInt();
		    System.out.println("Enter your zip code");
		    workPhoneNumber=scan.nextLong();
		    System.out.println("Enter your work phone number");
		    personalPhoneNumber=scan.nextLong();
		    System.out.println("Enter your personal phone number");
		    age=scan.nextInt();
		    System.out.println("Enter your age");
		    height=scan.nextDouble();
		    System.out.println("Enter your height");
		    weight=scan.nextDouble();
		    System.out.println("Enter your weight"+weight+"pounds");
		    isMarried=scan.nextBoolean();
		    System.out.println("Are you married");
		     contacts= workPhoneNumber+ ","+personalPhoneNumber+" and "+email;
		    System.out.println("Contacts: work phone number - "+workPhoneNumber+" personal phone number - "+personalPhoneNumber+" email: "+email);
		    fullName= lastName+" , "+firstName;
		    System.out.println(contacts);
		     address= street+" ,"+city+" , "+state+" , "+zipcode;
}
}