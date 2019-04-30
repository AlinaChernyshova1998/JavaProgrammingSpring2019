package vasil_class;
import java.util.Scanner;
public class Seasons {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter number: ");
	int season=scan.nextInt();
	if(season==12 || season>=1 && season<=2) {
		System.out.println("Winter!");
	}else if(season>=3 && season<=5) {
		System.out.println("Spring!");
	}else if(season>=6 && season<=8) {
		System.out.println("Summer!");
	}else {
		System.out.println("Autumn!");
	}
}
}
