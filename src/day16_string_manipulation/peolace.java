package day16_string_manipulation;
import java.util.Scanner;
public class peolace {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Type word(s):");
	String words= scan.nextLine();
System.out.println(words.replace("a", "y"));

System.out.println(words.replace(" ", "|"));	
}
}