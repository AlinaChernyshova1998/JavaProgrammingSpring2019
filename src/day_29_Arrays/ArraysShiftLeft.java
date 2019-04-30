package day_29_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysShiftLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    int[] nums = new int[size];
		    for(int i = 0; i < size; i++){
		      nums[i] = scan.nextInt();
		    }
		    //WRITE YOUR CODE HERE
		    int temp=nums[0];
		    for(int j=0; j<nums.length-1; j++){
		      nums[j]=nums[j+1];
		    }
		    nums[nums.length-1]=temp;
		System.out.println(Arrays.toString(nums));
	}

}
