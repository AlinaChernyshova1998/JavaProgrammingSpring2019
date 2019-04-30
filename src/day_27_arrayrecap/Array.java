package day_27_arrayrecap;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] num = new int[size];
		for (int i = 0; i < size; i++) {
			num[i] = scan.nextInt();
		}
		// WRITE YOUR CODE HERE
		int[] num2 = new int[num.length > 2 ? 2 : num.length];
		for (int i = 0; i < num2.length; i++) {
				num2[i]=num[i];
			}
				System.out.println(Arrays.toString(num2));
		}
	}

