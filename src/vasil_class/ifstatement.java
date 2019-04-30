package vasil_class;
import java.util.Scanner;
public class ifstatement {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub

System.out.println("Enter your age: ");
int age=scan.nextInt();
if(age>0 && age<21) {
	System.out.println("Under age");
}else {
	System.out.println("You are older 21!");
}
	}

}
