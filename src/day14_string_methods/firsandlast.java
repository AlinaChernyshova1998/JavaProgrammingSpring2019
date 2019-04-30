package day14_string_methods;

import java.util.Scanner;

public class firsandlast {
	public static void main(String[] args) {
	    //DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	    char firstChar=word.charAt(0);
	    char lastChar=word.charAt(word.length()-1);
	    System.out.print(firstChar);
	    System.out.print(lastChar);
	  }
	}
