package day_22_javarecap;
import java.util.Scanner;
public class Monthloop {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	int month=0;
	
	do {
		System.out.println("Enter month:");
		month=scan.nextInt();
		
	}while(month>=1 && month<=12);
	System.out.println("Invalid month - "+month);
}
}
