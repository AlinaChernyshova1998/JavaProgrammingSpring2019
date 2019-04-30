package day_35_;

import java.util.Arrays;

public class warmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		unique(new int[] { 5, 23, 23, 66, 66, 99, 99, 10 });
		//unique in public class
		int[] nums = { 12, 12, 55, 96, 96, 66, 66, 5, 77, 77 };
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println("Unique: " + nums[i]);
			}
		}
		System.out.println(Arrays.toString(uniq(new int []{12,55,55,23,66,66})));
	}

	public static void unique(int[] nums) {
		for (int n : nums) {
			int count = 0;
			for (int n1 : nums) {
				if (n == n1) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println("Unique: " + n);
			}
		}
	}
	public static int[] uniq(int[] num) {
		for (int i=0; i<num.length; i++) {
			int count=0;
			for (int j=0; j<num.length; j++) {
				if(num[i]==num[j]) {
					count++;
				}
			}
			if(count==1) {
				
			}
		}
		return num;
		
	}
}
