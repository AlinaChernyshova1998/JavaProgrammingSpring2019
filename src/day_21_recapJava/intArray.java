package day_21_recapJava;

import java.util.Arrays;

public class intArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 20, 15, 120, 30,50 };
		System.out.println(Arrays.toString(nums));
		for (int num : nums) {
			if (num >= 17) {
				System.out.println((num));
			}

		}
		//calculate sum using for loop
		int sum=0;
		for(int i=0; i<nums.length; i++) {
			sum+=nums[i];
		}
		System.out.println((sum)); 
		//print middle number and last one
		int m=nums[nums.length/2];
		int l=nums[nums.length-1];
		System.out.println("Middle num:"+m+" Last number: "+l);
		//find lowest num
		int lowest = nums[0];//20
		for(int i=0; i<nums.length;i++) {
			if(nums[i]<lowest) {
				lowest=nums[i];	
			}	
		}
		System.out.println("Lowest number: "+lowest);
		 //find bigger number
		int bigger= nums[0];//20
		for(int i=0; i<nums.length;i++) {
			if(nums[i]>bigger) {
				bigger=nums[i];	
			}	
		}
		System.out.println("Bigger number: "+bigger);
	}

}
