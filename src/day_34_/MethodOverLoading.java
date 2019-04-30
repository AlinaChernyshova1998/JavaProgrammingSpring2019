package day_34_;

public class MethodOverLoading {
public static void main(String[] args) {
	add("alina","anna");
	add(2.3333, 9.235);
			
}
public static void add(int num1, int num2) {
	int result= num1+num2;
	System.out.println("Result: "+result);
	
}
public static void add(double num1, double num2) {
double result= num1+num2;
	System.out.println("Result: "+result);
}
public static void add(String str1, String str2) {
String result= str1+" "+str2;
	System.out.println("Result: "+result);
}
}