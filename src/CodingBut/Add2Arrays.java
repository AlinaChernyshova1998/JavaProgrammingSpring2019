package CodingBut;

import java.util.*;

public class Add2Arrays {
	public static void main(String[] args){
	 int [] ints= {10, 40, 50, 3, 1};
		int[]ints1={11, 0, 500, 44, 1101};
		System.out.println(Arrays.toString(addElements(ints, ints1)));
		
		  }

	public static int[] addElements(int[] ints1, int[] ints2) {

		int[] sum = new int[ints1.length];
		for (int i = 0; i < ints1.length; i++) {

			sum[i] = ints1[i] + ints2[i];

		}
		return sum;

	}

}
