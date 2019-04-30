package vasil_class;
import java.util.Scanner;
public class returnOperator {

	public static void main(String[] args) {
	int time=20;
	System.out.println((time<18) ?"Good day!":"Good evening!");
Scanner scan= new Scanner(System.in);
System.out.println("Enter score: ");
int score=scan.nextInt();
System.out.println(score>64?"Passed":"Failed");
	}

}
