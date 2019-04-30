package day_27_arrayrecap;

import java.util.Arrays;

public class CopyOf {
public static void main(String[]args) {
	double [] d1= {2.3, 4.5,6.3};
	double []d2=d1;
	System.out.println(Arrays.toString(d1));
	System.out.println(Arrays.toString(d2));
	d1[0]=1000.3;
	System.out.println(Arrays.toString(d1));
	System.out.println(Arrays.toString(d2));
	d2[1]=56.3;
	System.out.println(Arrays.toString(d1));
	System.out.println(Arrays.toString(d2));
	double [] d3=Arrays.copyOf(d2, d2.length);
	System.out.println(Arrays.toString(d3));
}
}
