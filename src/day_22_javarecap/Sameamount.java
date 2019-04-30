package day_22_javarecap;

import java.util.Scanner;

public class Sameamount {
	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int countOfCats = 0;
		    int countOfDogs = 0;
		    String word = scan.next();
		    
		    for (int i=0;i<=word.length()-3; i++) {
				if(word.substring(i,i+3).equalsIgnoreCase("cat")) {
					countOfCats++;
					
				}
					if(word.substring(i,i+3).equalsIgnoreCase("dog")){
						countOfDogs++;
					
					}	
				
				
			}
			if(countOfCats==countOfDogs) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
		  }
		}