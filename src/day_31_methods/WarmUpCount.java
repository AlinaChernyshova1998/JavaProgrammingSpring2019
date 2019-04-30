package day_31_methods;

import java.util.Scanner;

public class WarmUpCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//void= doesn't return value
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter param to CountUp");
		int num=scan.nextInt();
		countUp(num);
		countDown(5);
		
	}
public static void countUp(int param) {
	
	
		if(param<1) {
			System.out.println("invalid number!"+param);
			
		}else {
			for(int i=1; i<=param; i++) {
			System.out.print(i+" ");
		}
	
	}
	System.out.println();
}

public static void countDown(int param) {
	for(int i=param; i>=1; i--) {
		System.out.print(i+" ");
	}
	
}
}
