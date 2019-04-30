package day_21_recapJava;

import java.util.Scanner;

public class unique2 {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter word:");
	String word=scan.next();
	String unique="";
	for(int i=0; i<word.length();i++) {
		//read letter and assign 
		char letter=word.charAt(i);
		System.out.println(letter);
	}
	for(int i=0; i<word.length(); i++) {
		System.out.print(i);
		System.out.println(word.charAt(i));
	}
	}

}
