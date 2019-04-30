package day_28_multid_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BiggerNumMultiArrays {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int rows = inp.nextInt(), cols = inp.nextInt();
		int[][] arr = new int[rows][cols];
		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j <= cols - 1; j++) {
				arr[i][j] = inp.nextInt();
			} // end for cols
		} // end for rows

		// TODO write your code below
		int big = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > big) {
					big = arr[i][j];
				}
			}

		}

		System.out.println(big);

		// FINAL PRINT
		System.out.println(Arrays.deepToString(arr));
	}
}