package day10_IfElse.java;

import java.util.Scanner;

public class equalsJava {
	 public static void main(String[] args) {
		    Scanner s = new Scanner(System.in);
		    String word1;
		    String word2;
		    System.out.println("Enter word1: ");
		    System.out.println("Enter word2: ");
		    word1=s.next();
		    word2=s.next();
		    
		    //your code here
		    if(word1==word2) {
		    	System.out.println("word1 equals word2");
		    }else{
		    	System.out.println("word1 does not equals word2"); 	
		    	
		    }
		    
		  }
		
}
