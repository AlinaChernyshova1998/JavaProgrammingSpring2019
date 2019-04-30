package day11_logical_operator;

import java.util.Scanner;

public class ToolCalculator {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println(" Enter Vehicle Type: ");//1.2
	String RushHour; // true or false
	int carType;//
	
	double price;
	
	carType= scan.nextInt();
	System.out.println("is rush hour: yes or no? ");
	RushHour=scan.next();
	boolean isRushHour;
	if(RushHour.equals("yes")) {
		isRushHour=true;
		System.out.println(isRushHour);
	}else if(RushHour.equals("no")){
		isRushHour=false;
		System.out.println(isRushHour);
	}else{
		isRushHour=false;
		System.out.println(isRushHour);
		
		
		price=0.0;
		if(carType==1) {
			if(isRushHour) {
			price=30.0;
			
			}else {
				price=5.5;
				
				
			}
		}else if(carType==2) {
			if(isRushHour) {
				price=55.30;
			}
		}else{
			price=15.99;
			System.out.println("Total cost: "+price);
		}
	}
	
}
}
