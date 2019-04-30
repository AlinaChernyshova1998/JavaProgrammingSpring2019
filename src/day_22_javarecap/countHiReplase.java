package day_22_javarecap;

import java.util.Scanner;

public class countHiReplase {
	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String str = scan.nextLine();
		    int length1=str.length();
		    str=str.replace("hi", "");
		    int length2=str.length();
		   
		    int count= (length1-length2)/2;
		    System.out.println(count);
		  }
		
}
