package day30_methods2;
import java.util.*;
public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		star();
//call star 100 times
		for (int i = 0; i <= 100; i++) {
			star();
		}
		introduce();
	}

	public static void star() {
		System.out.println("*****");

	}
	public static void introduce() {
	Scanner scan= new Scanner(System.in);
	System.out.println("What's your name");
	String name=scan.next();
	System.out.println("Nice to meet you,  "+name);
	}
 
	 
 
}
