package day_46_;

public class CalcTest {
public static void main(String[] args) {
	double result=Calculator.plus(12, 20);
	System.out.println("Add: "+result);
	result=Calculator.multiply(55, 10);
	System.out.println("Multiplication: "+result);
	result=Calculator.minus(55, 20);
	System.out.println("Minus: "+result);
	
	Calculator c= new Calculator();
	System.out.println("Multiplication for c: "+c.multiply(22, 11));
	
	int i=Integer.parseInt("33");
	boolean answer= Character.isDigit('5');
	System.out.println(i);
	System.out.println(answer);
}
}
