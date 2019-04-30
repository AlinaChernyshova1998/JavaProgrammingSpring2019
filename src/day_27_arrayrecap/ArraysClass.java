package day_27_arrayrecap;

import java.util.Arrays;

public class ArraysClass {
public static void main(String[]args) {
	
	int [] nums= {5, 2, 6, 9};
	//toString method
	System.out.println(Arrays.toString(nums));
	String str=Arrays.toString(nums);
	System.out.println(str);
	//sort methods
	Arrays.sort(nums);
	System.out.println(Arrays.toString(nums));
	String [] languages= {"italiano","ukrainian", "polish","arabic","russian"};
	System.out.println(Arrays.toString(languages));
	Arrays.sort(languages);
	System.out.println(Arrays.toString(languages));
	int[] nums2= {235,564,856,788};
	//find lowest and largest numbers
	System.out.println(Arrays.toString(nums2));
	Arrays.sort(nums2);
	System.out.println(Arrays.toString(nums2));
	int lower=(nums2[0]);//smaller
	int bigger=(nums2[nums2.length-1]);
	System.out.println(lower);//smaller
	System.out.println(bigger);//bigger
}
}
