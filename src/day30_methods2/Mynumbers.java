package day30_methods2;

import java.util.Random;
import java.util.Scanner;

public class Mynumbers {
	public static void main(String[] args) {
		showme5Numbers();
	}
	public static void showme5Numbers() {
		Random random = new Random();
		for(int i=1;i<=5;i++ ) {
			System.out.print(random.nextInt(1001)+",");
			
		}
		System.out.println();
		do10pushups();
		rangePrint();
	}
	public static void do10pushups() {
		
	
		for(int i=1; i<=10; i++) {
			
				System.out.println("Push ups-" +i);
				
			}
				System.out.println("Time to rest");
			
		}
	public static void rangePrint() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 integers: ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		if(num1>num2) {
		for(int i=num1; i>=num2;i--) {
			System.out.println(i);
		}
	}else if(num2>num1) {
		for(int i=num1; i<=num2;i++) {
			System.out.print(i+",");
		}
	}else {
		System.out.println(num1);
		}
	}
	}

