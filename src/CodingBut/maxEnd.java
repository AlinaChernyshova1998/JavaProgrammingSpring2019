package CodingBut;

import java.util.Arrays;

public class maxEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Arrays.toString(maxEnd3((new int [] {1, 2, 3}))));
		//System.out.println(maxEnd3(new int [] {1, 2, 3,6}));
	}
	public static  int []maxEnd3(int[] nums) {
		  int max=nums[0];
		  for(int i=0; i<nums.length; i++){
		    if(nums[i]>max){
		  max=nums[i]; 
		  nums[i]=max;
		    }
		  }
		return nums;
		}

}
