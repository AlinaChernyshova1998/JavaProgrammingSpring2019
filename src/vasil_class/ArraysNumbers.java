package vasil_class;

import java.util.Arrays;

public class ArraysNumbers {
	public static void main(String[] args) {
		int [] nums= {123,100,526,666};
		System.out.println(nums[1]);
		System.out.println(Arrays.toString(nums));
		int max=nums[0];
		for(int num:nums) {
			if(max<num) {
				max=num;
			}
		}
		System.out.println("Max value: "+max);
}
}