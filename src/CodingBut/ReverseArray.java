package CodingBut;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Arrays.toString(reverse3(new int[] {1, 2, 3,4,5,6})));
	}
	public static int[] reverse3(int[] nums) {
		  int temp=0;
		  int num=nums.length;
		  for(int i=0;i<nums.length/2; i++, num--){
		   temp=nums[i];
		   nums[i]=nums[nums.length-1];
		   nums[nums.length-1]= temp;
		  }
		  return nums;
		}
}
