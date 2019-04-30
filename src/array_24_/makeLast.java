package array_24_;

import java.util.Arrays;
import java.util.Scanner;

public class makeLast {

		// TODO Auto-generated method stub
		 public static void main(String[] args) {
			    Scanner scan = new Scanner(System.in);
			    int size = scan.nextInt();
			    int[] nums = new int[size];
					for(int i =0; i < size; i++) {
						nums[i] = scan.nextInt();
					}
					//WRITE YOUR CODE HERE
					int length=nums.length*2;
					int[] num2 = new int[length];
					for (int i = 0; i < length-1; i++) {
						num2[i] = nums[i];
					}
					System.out.println(Arrays.toString(num2));
		 }

}
