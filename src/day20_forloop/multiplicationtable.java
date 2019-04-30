package day20_forloop;

import java.util.Scanner;

public class multiplicationtable {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter number: ");
	int num=scan.nextInt();
	if(num<1 || num>10) {
		System.out.println("Not valid number!");
		return;
	}
		for(int i=1;i<=10;i++) {
			int sum=num*i;
			System.out.println(i+"x"+num+"="+sum);
		}
	}
}

