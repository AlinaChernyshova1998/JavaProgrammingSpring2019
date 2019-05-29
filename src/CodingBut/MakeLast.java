package CodingBut;

import java.util.Arrays;

public class MakeLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Given an int array, return a new array with double the length where its last element is the same as the original array,
 *  and all the other elements are 0. 
 *The original array will be length 1 or more. 
 *Note: by default, a new int array contains all 0's.
 */
	System.out.println(Arrays.toString(makeLast(new int [] {1,2,3})));	
	}
	public static int[] makeLast(int[] nums) {
		  int [] newNum= new int [nums.length*2];
		  newNum[newNum.length-1]=nums[nums.length-1];
		  return newNum;
		}

}
