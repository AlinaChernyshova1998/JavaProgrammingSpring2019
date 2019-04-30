package day_27_arrayrecap;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] nums= {10,33,32,56,88};
Arrays.sort(nums);
System.out.println(Arrays.toString(nums));
System.out.println(Arrays.binarySearch(nums, 56));
int i=Arrays.binarySearch(nums, 56);
System.out.println(i);
int [] nums1= {11,33,98,56,88};
Arrays.sort(nums1);//11,33,56,88,98
System.out.println(Arrays.binarySearch(nums1, 88));
	}

}
