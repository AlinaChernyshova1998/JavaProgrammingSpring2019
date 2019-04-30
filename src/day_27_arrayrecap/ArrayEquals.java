package day_27_arrayrecap;

import java.util.Arrays;

public class ArrayEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1={3,5,6,10,100};
		int[] nums2={3,5,6,10,100};
		System.out.println(Arrays.equals(nums1, nums2));
		if(Arrays.equals(nums1, nums2)){
		System.out.println("They are exactly same");
		}else {
			System.out.println("Mistmatch values present");
		}
		String[] str1= {"one","two","tree","four"};
		String[] str2= {"one","two","tree","four"};
		System.out.println(Arrays.equals(str1, str2));
		boolean match=(Arrays.equals(str1, str2));
		System.out.println(match);
		String fruits="apple, orange, apple";
		String fruits1="apple, orange, orange";
		String[] fruit=fruits.split(",");
		String [] fruit1=fruits1.split(",");
		for(int i=0; i<fruit.length; i++) {
			if(!fruit[i].equals(fruit1[i])) {
				System.out.println("Dismatch");
			}
		}
		System.out.println(Arrays.equals(fruit, fruit1));
	}
	

}
