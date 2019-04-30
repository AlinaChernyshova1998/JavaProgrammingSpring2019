package day_31_methods;
import java.util.*;

public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your operation: ");
		String operation=scan.next();
		System.out.println("Enter 2 numbers: ");
		double n1=scan.nextDouble();
		double n2=scan.nextDouble();
		switch(operation) {
		case "+":
			add(n1,n2);
			break;
		case "-":
			substract(n1, n2);
			break;
		case"*":
			multiply(n1, n2);
			break;
		case"/":
			devided(n1,n2);
			break;
		case"%":
			remaineder(n1,n2);
		
		
		default:
			System.out.println("invalid operator");
			
		}
		//devided(15, 3);	
		//using scanner pass 2 num and operator
	}
public static void add(double num1, double num2) {
	double result=num1+num2;
	System.out.println("Result: "+result);
	
}
public static void substract(double num1, double num2) {
	double result=num1-num2;
	System.out.println("Result: "+result);
}
public static void multiply(double num1, double num2) {
	
	double result=num1*num2;
	if(num1==0) {
		System.out.println("cannot multiply by 0");
		return;
	}else {
	System.out.println("Result: "+result);
}
}
public static void devided(double num1, double num2) {
	double result=num1/num2;
	if(num1==0) {
		System.out.println("cannot devided by 0");
		return;
	}else {
	System.out.println("Result: "+result);
}
}
public static void remaineder(double num1, double num2) {
	double result=num1%num2;
	System.out.println("Result: "+result);
	
}
}
