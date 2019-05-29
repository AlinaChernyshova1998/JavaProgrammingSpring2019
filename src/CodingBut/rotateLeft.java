package CodingBut;

import java.util.Arrays;

public class rotateLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Arrays.toString(rotateLeft3(new int [] {1, 2, 3})));
	}
	public static int[] rotateLeft3(int[] nums) {
		  int temp= nums[0];
		  for(int i=0; i<nums.length-1; i++){
		    nums[i]=nums[i+1];
		  }
		  nums[nums.length-1]=temp;
		  return nums;
		}

}
