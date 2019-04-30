package day10_IfElse.java;

import java.util.Scanner;

public class Candy {
	public static void main(String[] args) {
	    //Write your code here
	    Scanner scan=new Scanner(System.in);
	    int coupons , candy, gumball;
	    System.out.println("Enter number of coupons: ");
	    coupons=scan.nextInt();
	    if(coupons>=3){
	      candy=coupons/10;
	      gumball= coupons % 10/3;
	      System.out.println("Number of Candies:"+candy);
	      System.out.println("Number of Cumballs:"+gumball);
	   
	    }else{
	    	System.out.println("Not enough coupons");
	    }     
    }
}

