package CodingBut;
import java.util.*;
public class MidlleTreeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Arrays.toString(midThree(new int [] {1, 2, 3, 4, 5})));
	}
	public static int[] midThree(int[] nums) {
		int [] middleTree= new int[3];
		middleTree[0]= nums[nums.length/2-1];
		middleTree[1]= nums[nums.length/2];
		middleTree[2]= nums[nums.length/2+1];
		
		return middleTree;
		  
	}
}
