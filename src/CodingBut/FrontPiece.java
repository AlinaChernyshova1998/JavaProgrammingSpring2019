package CodingBut;
import java.util.*;
public class FrontPiece {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Given an int array of any length, return a new array of its first 2 elements. 
 * If the array is smaller than length 2, use whatever elements are present.
 */
System.out.println(Arrays.toString(frontPiece(new int [] {1})));
	}
	public static int[] frontPiece(int[] nums) {
		  if(nums.length>2){
		    int [] num= new int [2];
		    num[0]=nums[0];
		    num[1]=nums[1];
		    return num;
		  }else{
		    return nums;
		  }
}
}
