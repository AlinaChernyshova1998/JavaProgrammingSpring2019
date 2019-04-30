package day_23_array;

public class Array1 {
public static void main(String[] args) {
	int [] numbers=new int[3];
	int num1=5;
	int num2=7;
	int num3=10;
	//assign to the first value inside of num1 
	numbers[0]=num1;
	numbers[1]=num2;
	numbers[2]=num3;
	//we can't provide another data type
	System.out.println(numbers[0]);
	System.out.println(numbers[1]);
	System.out.println(numbers[2]);
	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");
	for(int i= 0;i<numbers.length;i++ ) {
		System.out.println(numbers[i]);
}
	byte[] bytesArray=new byte[10000000];
}
}