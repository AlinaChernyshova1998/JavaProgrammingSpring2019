package CodingBut;

import java.util.Arrays;

public class fix23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Arrays.toString(fix23(new int [] {1,2,3})));
	}
	public static int[] fix23(int[] nums) {
		  for(int i=0; i<nums.length; i++){
		    if(nums[i]==2 && nums[i+1]==3){
		      nums[i+1]=0;
		      return nums;
		    }

		  }
		  return nums;
		}

}
