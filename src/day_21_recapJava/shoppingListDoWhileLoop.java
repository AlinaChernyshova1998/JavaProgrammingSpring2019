package day_21_recapJava;

import java.util.Scanner;

public class shoppingListDoWhileLoop {
	
	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
				String shoppingListReport = "";
				String item = "";
				String countinue = "";
				double price = 0;
				int count = 1;
				double totalPrice = 0;
					do{
				  System.out.println("Enter Item"+count+ " and its price:");
				  item=scan.next();
				  price=scan.nextDouble();
				  shoppingListReport+="Item"+count+": "+item+" Price: "+price+", ";
				  System.out.println("Add one more item?"); 
				  countinue=scan.next();
				   count++;
				   totalPrice+=price;
			
				}while(countinue.equalsIgnoreCase("yes"));
				 
				System.out.println(shoppingListReport.substring(0, shoppingListReport.lastIndexOf(",")));
				System.out.println("Total price: "+totalPrice);
		
	 }
	}	

