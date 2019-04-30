package day12_warmup;

import java.util.Scanner;

public class Weather {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter weather:");
	String weather;
	weather=scan.next();
	switch(weather) {
	case "sunny":
	System.out.println("Go outside , Code JAVA");
	break;
	case "hot":
	System.out.println("Go swimming, Code JAVA");
	break;
	case "windy":
	System.out.println("Fly a kite , Code JAVA");
	break;		
	case "rainy":
	System.out.println("Go shopping, Code JAVA");
	break;
	case "snow":
	System.out.println("Go skiing , Code JAVA");
	break;
	default:
		System.out.println("Code JAVA in any weather");
		
	}
}
}