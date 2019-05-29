package CodingBut;
import java.util.*;
public class FindMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. 
* The array length will be a least 1.*/
System.out.println(maxTriple(new int [] {1, 2, 3,10}));
	}
	public static int maxTriple(int[] nums) {
		int first=nums[0];
		int last=nums[nums.length-1];
		int middle= nums[nums.length/2];
		if(first>last && first>middle) {
			return first;
		}else if(middle>first && middle>last) {
			return middle;
		}else {
			return last;
		}
	
	}

}
