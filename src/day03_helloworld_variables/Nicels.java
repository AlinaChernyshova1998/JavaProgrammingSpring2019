package day03_helloworld_variables;
import java.util.*;
public class Nicels {
	

	
	  public static void main(String[] args) {
	    //ENTER CODE HERE
	  Scanner scan= new Scanner(System.in);
	  int itemPrice, quarters, dimes, nickels;
	  System.out.println("Enter price in cents:");
	  itemPrice = scan.nextInt();
	  if(itemPrice >= 25 && itemPrice <= 100 && itemPrice %5 == 0){
	  
	  itemPrice = 100-itemPrice; //65
	  quarters = itemPrice / 25; //2
	  dimes=itemPrice % 25 / 10; //15 -- 1
	  nickels=itemPrice % 25 % 10 / 5;
	  System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, and "+nickels+" nickles");
	    
	  }
	   else if (itemPrice<25 && itemPrice>100){
	     System.out.println("Invalid price!");
	     
	   } else{
	      System.out.println("Invalid price!");
	   }
	  }
	
}
