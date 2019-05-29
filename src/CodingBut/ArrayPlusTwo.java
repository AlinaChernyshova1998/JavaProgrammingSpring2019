package CodingBut;

import java.util.Arrays;

public class ArrayPlusTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Arrays.toString(plusTwo(new int [] {1, 2},new int [] {3,5})));
	}
	public static  int[] plusTwo(int[] a, int[] b) {
		  int [] c= new int[a.length+b.length];
		  c[0]=a[0];
		  c[1]=a[1];
		  c[2]=b[0];
		  c[3]=b[1];
		return c;
		}
}
