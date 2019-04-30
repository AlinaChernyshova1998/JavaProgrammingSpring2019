package day_27_arrayrecap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class convertDecimalToBinary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Stack<Integer> s = new Stack<Integer>();
		int decimal = input.nextInt();
		int[] binary = new int[8];
		int index = 0;
		while (decimal > 0) {
			binary[index] = decimal % 2;
			index++;
			decimal = decimal / 2;

		}
		for (int i = index - 1; i >= 0; i--) {

		}
		System.out.println(Arrays.toString(binary));
		Arrays.sort(binary);
	}
}