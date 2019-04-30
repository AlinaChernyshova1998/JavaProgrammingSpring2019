package day_21_recapJava;

import java.util.Scanner;

public class printMiddle {
public static void main(String[]args){
	String word="javaclass";
	//print middle char
	System.out.println("Middle one: "+word.charAt(word.length()/2));
	word="javadays";
	String middle2=word.charAt(word.length()/2-1)+""+word.charAt(word.length()/2);
	System.out.println("Middle 2: "+middle2 );
	
	
	//
	String middleTwo=word.substring(word.length()/2-1,word.length()/2+1);
	System.out.println("Middle Two: "+middleTwo);
	Scanner scan= new Scanner(System.in) ;
			System.out.println("Enter your word");
	String str=scan.next();
	String m="";
	if(str.length()%2==0) {//even count of char
		m=str.substring(str.length()/2-1, str.length()/2+1);
	}else {
		m=str.substring(str.length()/2, str.length()/2+1);
	}
	System.out.println("M: "+m );
}
}
