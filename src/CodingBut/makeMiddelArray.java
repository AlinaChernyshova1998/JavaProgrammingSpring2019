package CodingBut;
import java.util.*;
public class makeMiddelArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Arrays.toString(makeMiddle(new int [] {4,2,6,8})));
	}
	public static int[] makeMiddle(int[] nums) {
		int [] num= new int[2];
		num[0]= nums[nums.length/2-1];
		num[1]= nums[nums.length/2];
	
	
		 
		return num;
}
}