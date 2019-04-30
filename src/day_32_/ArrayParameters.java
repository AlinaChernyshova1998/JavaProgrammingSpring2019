package day_32_;

import java.util.Arrays;

public class ArrayParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//two options to call method printArray
/*1*/ int [] MyArray= {12,22,55};//num=MyArray
printArray(MyArray);
/*2*/ printArray(new int [] {12,25,56}); 
printArray(new int [] {12,25,56,54,44,856, 4444}); 
print2Arrays(new int[] {12,22,55,85,96}, new int [] {55,66,22,88,55});
print2ArraysV2(new int [] {12,52,66} ,new int[] {12,12});
	}
public static void printArray(int [] num) {
for(int n:num) {
	System.out.print(n+" ");
}
System.out.println();
}

public static void print2Arrays(int[] num1, int [] num2) {
	if(num1.length>num2.length) {
		System.out.println("Num1 is bigger "+Arrays.toString(num1));
	}else if(num1.length<num2.length) {
		System.out.println("Num2 is bigger: "+Arrays.toString(num2));
	}else {
		System.out.println("They are the same!");
	}
}
public static void print2ArraysV2(int[] num1, int [] num2) {
	if(num1.length>num2.length) {
		printArray(num1);
	}else if(num1.length<num2.length) {
		printArray(num2);
	}else {
		System.out.println("They are the same!");
	}
}
}
