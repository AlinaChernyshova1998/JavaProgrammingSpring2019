package CodingBut;

import java.util.Arrays;

public class FindMaxFirstOrLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Given an array of ints length 3, figure out which is larger, the first or last element in the array, 
		 * and set all the other elements to be that value. Return the changed array.
		 */
System.out.println(Arrays.toString(maxEnd3(new int[] {1,2,3})));
	}
	public static int[] maxEnd3(int[] nums) {
		 for(int i=0; i<nums.length; i++){
		   if(nums[0]>nums[nums.length-1]){
		    nums[i]=nums[0];
		   }else{
		     nums[i]=nums[nums.length-1];
		   }
		 }
		 return nums;
		}

}
