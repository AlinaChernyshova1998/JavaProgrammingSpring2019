package CodingBut;
import java.util.*;
public class SwapEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Arrays.toString(swapEnds(new int [] {1, 2, 3, 4})));
	}
	public static int[] swapEnds(int[] nums) {
		int swap=nums[0];
		nums[0]=nums[nums.length-1];
		nums[nums.length-1]=swap;
		return nums;
		  
	}
}
