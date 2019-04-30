package day17_string_manipulation;

import java.util.Scanner;

public class carinsurencequote {
	public static void main(String[] args) {
	    //DO NOT CHANGE
	    double premium = 0;
	    int age;
			int accidentsAmount = 0;
			int driverexcp;
			int daysDrivenToWorkOrSchool = 0;
			int milesToWorkOrSchool = 0;
			String vehicleOwnership = "";
			String vehicleUsage = "";
			String continuousInsurance = "";
			String accidents;
			String education = "";
			String name = "";
			String driverlicense;
			int zipcode;
			String referenceNumber = "";
			Scanner scan = new Scanner(System.in);
			System.out.println("Welcome to the CountyFarm car insurance!");
	    //WRITE YOUR CODE HERE
	    	System.out.println("Enter your name");
	    	name=scan.nextLine();
	    	System.out.println("Do you have a US driver license?");
	    	driverlicense=scan.next();
	    	if(driverlicense.equalsIgnoreCase("no")){
	    	  System.out.println("Invalid data!");
	    	}else if (driverlicense.equalsIgnoreCase("yes")) {
	    	  System.out.println("Enter your zip code");
	    	  zipcode=scan.nextInt();
	    	  if(zipcode==20910 || zipcode==20740){
	    	    premium=premium+60;
	    	  }else if (zipcode==22102 || zipcode==22103){
	    	    premium=premium+30;
	    	  }else{
	    	    premium=premium+50;
	    	  }
	    	  System.out.println("Is this vehicle Owned, Financed, or Leased?");
	    	  vehicleOwnership=scan.next();
	    	  if(vehicleOwnership.equalsIgnoreCase("owned")){
	    	    premium=premium+10;
	    	  }else{
	    	    premium=premium+20;
	    	  }
	    	  System.out.println("How is this vehicle primarily used?"); 
	    	  vehicleUsage=scan.next();
	    	  if(vehicleUsage.equalsIgnoreCase("Business")){
	    	    premium=premium+50;
	    	  }else if(vehicleUsage.equalsIgnoreCase("Pleasure")){
	    	    premium=premium+10;
	    	}else if (vehicleUsage.equalsIgnoreCase("Commute")){
	    	    premium=premium+20;
	    	    System.out.println("Days Driven To Work And/Or School");
	    	    daysDrivenToWorkOrSchool=scan.nextInt();
	    	    premium+=daysDrivenToWorkOrSchool*5;
	    	    System.out.println("Miles Driven To Work And/Or School");
	    	    milesToWorkOrSchool=scan.nextInt();
	    	    premium+=(milesToWorkOrSchool*1);
	  }
	          System.out.println("How old are you?");
	          age=scan.nextInt();
	          if(age<16){
	            System.out.println("Invalid data!");
	            return;
	          }else if(age>=16 && age<18){
	            premium=premium*20;
	          }else if(age>=18 && age<=21){
	            premium=premium*6;
	          }else if(age>21 && age<25){
	            premium=premium*2;
	          }
	          System.out.println("How many years you've been driving?");
	          driverexcp=scan.nextInt();
	          if(driverexcp>0 && age>=16){
	            premium=premium-(driverexcp*5);
	          }else{
	            System.out.println("Invalid data!");
	            return;
	          }
	          System.out.println("Have you had any accidents in the last 5 years?");
	          accidents=scan.next();
	          if(accidents.equalsIgnoreCase("yes")){
	            System.out.println("How many?");
	            accidentsAmount=scan.nextInt();
	            premium+= accidentsAmount*premium*0.2;
	            }
	          System.out.println("Have you had continuous insurance for the past 12 months?");
	          continuousInsurance=scan.next();
	          if(continuousInsurance.equalsIgnoreCase("no")){
	            premium=premium*2;
	          }
	         System.out.println("What is the highest level of education you have completed?");
	         education=scan.next();
	         if(education.equalsIgnoreCase("PhD") || education.equalsIgnoreCase("Bachelors")||education.equalsIgnoreCase("Masters")) {
	         premium-=premium*0.05;
	          }else if(education.equalsIgnoreCase("Doctors")){
	            premium-=premium*0.1;
	         }else{
	           premium+=premium*0.05;
	           education="LessthanHighSchool" ;
	         }
	         System.out.println(name+", here's your quote!");
	         System.out.println("Start Your Policy Today For: $"+premium);
	        
	          referenceNumber=(name.substring(0,2)+age+name.substring(name.length()-2)+zipcode+education);
	            referenceNumber=referenceNumber.toUpperCase();
	          System.out.println("Reference number: "+referenceNumber);
}
}
}
