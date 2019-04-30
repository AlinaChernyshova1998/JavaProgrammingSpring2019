package day_22_javarecap;

import java.util.Scanner;

public class LookForJava {
	  public static void main(String[] args) {
		    Scanner scan= new Scanner(System.in);
		    String word = scan.next();
		   int count=0;
		    for(int i=0; i<=word.length()-4; i++){
		      String temp=word.substring(i,i+4);
		      if(temp.equalsIgnoreCase("java")){
		        count++;
		      }
		    
		    }
		      System.out.println(count); 
		    
		    
		  }
		}