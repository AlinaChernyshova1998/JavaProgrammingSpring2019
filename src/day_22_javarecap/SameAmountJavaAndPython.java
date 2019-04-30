package day_22_javarecap;

import java.util.Scanner;

public class SameAmountJavaAndPython {
	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String sentence = scan.nextLine();
		    int java=0;
		    int python=0;
		  for(int i=0; i<=sentence.length()-4; i++){
		    if(sentence.substring(i, i+4).equalsIgnoreCase("java")){
		      java++;
		    }
		  }
		    for (int a=0;a<=sentence.length()-6; a++) {
		   if(sentence.substring(a, a+6).equalsIgnoreCase("python")) {
		     python++;
		   }
		    }
		    if (java==python){
			     System.out.println("true");
		   }else {
		   System.out.println("false");
		  }
}
	 }
