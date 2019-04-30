package day_27_arrayrecap;

import java.util.Arrays;
import java.util.Scanner;

public class SplitArray {
	/*
	 * Write a program that will find out shortest words in the given string str. If
	 * there are few words that are evenly short, print them all. Use split method
	 * in order to split str string variable and create an array of strings. Print
	 * array with Arrays.toString() method. Sort array before printing.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		String[] str1 = str.split(",");
		String count = " ";
		String min = str1[0];
		int index = 0;
		for (int i = 0; i < str1.length; i++) {
			String temp = str1[i];
			if (min.length() > temp.length()) {
				min = str1[i];
				index = i;
				count +=str1[index];

			}
			
		}
		Arrays.sort(str1);
	System.out.println(count);
		System.out.println(Arrays.toString(str1));
	}

}
