package day_32_;

public class MethodsWithReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(giveMe10Dollars());
		int i=giveMe10Dollars();
		System.out.println(i);
		System.out.println(giveMeUrName());
		String name=giveMeUrName();
		System.out.println(name);
	}
	//this method returns int value
public static int giveMe10Dollars() {
	System.out.println("return 10 from method");
	return 10; 
	
}
public static String giveMeUrName() {
	System.out.println("What is your name?");
	return "Alina";
}

}
