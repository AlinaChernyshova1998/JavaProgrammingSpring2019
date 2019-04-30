package day09_scanner;

import java.util.Scanner;

public class Canada {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("What is the capital of Canada?");
	String capital=scan.next();
	if(capital.equalsIgnoreCase("Ottawa")) {
	System.out.println("Your answer is correct!");
}else{
	System.out.println("Your answer is not correct!");
}

}
}