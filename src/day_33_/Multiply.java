package day_33_;

public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(multiply(10,10));
System.out.println(minus(10,10));
System.out.println(devided(0,20));
	}
public static double multiply(double a, double b) {
double multiply=a*b;
	return  multiply;
	
}
public static int minus(int num1, int num2) {
	int minus=num1-num2;
	return minus;
}
public static int devided(int num1, int num2) {
	if(num2==0) {
		System.out.print("Error ");
		return 0;
	}else {
	int devided=num1/num2;
	return devided;
}
}
}