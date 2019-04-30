package day_21_recapJava;
import java.util.Scanner;
public class Register {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
 System.out.println("How many items are you purchasing?");
 int items=scan.nextInt();
 double itemsPrice;
 String variable="";

 double totalPrice=0.0;
String items1="";
 for(int i=1; i<=items;i++) {
	 System.out.println("What is item "+i+"?");
	 variable=scan.next();
	
	 System.out.println("How much is ?");
	 itemsPrice=scan.nextDouble();
	totalPrice+=itemsPrice;
	items1 +=variable+",";
	 
 }
 System.out.println("----------");
 System.out.println("Your items:"+items1);
 System.out.println("Your total price:"+totalPrice);
}
}
