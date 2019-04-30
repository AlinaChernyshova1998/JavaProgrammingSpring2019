package day08_scanner;

import java.util.Scanner;

public class PositiveOrNegative {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int num = s.nextInt();

	    //your code here
	    
	   if(num<0) {
	   System.out.println("negative");
	   }
	   if(num>0) {
	   System.out.println("positive");  
	   }
	   if(num==0) {
       System.out.println("zero");
	   }
}
}
	