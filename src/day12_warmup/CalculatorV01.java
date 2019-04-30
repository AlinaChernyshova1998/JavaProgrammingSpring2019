package day12_warmup;

import java.util.Scanner;

public class CalculatorV01 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);

	System.out.println("Enter first number:");
	double num1; 
	num1=scan.nextDouble();
	System.out.println("Enter second number:");
	double num2;
	num2=scan.nextDouble();
	System.out.println("Select operarion:+,-,*,/,%");
	String operator=scan.next();
	 if(operator.equals("+")) {
		 System.out.println(num1+num2);
	 }else if(operator.equals("-")) {
		 System.out.println(num1-num2); 
	 }else if(operator.equals("*")) {
		 System.out.println(num1*num2);
	 }else if(operator.equals("/")) {
		 System.out.println(num1/num2); 
	 }else if(operator.equals("%")) {
		 System.out.println(num1%num2); 
	 }else {
		 System.out.println("Invalid operator selected: "+operator);
	 }
}
}
