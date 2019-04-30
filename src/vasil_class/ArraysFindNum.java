package vasil_class;

import java.util.Arrays;

public class ArraysFindNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums = {{ 123, 532, 34, 643, -345, 73, 436, 344362, 547 },
				{ 12123, 657, 34, 56643, -567, 73, 345, 4563657, 35673576 },
				{ 22342, 343, 3453245, 34534, -567, 73, 345, 4563657,  }
					};
		int max=0;
		//this is changing rows
		for(int i=0; i<nums.length; i++) {
			//this is changing columns
			for(int j=0; j<nums[i].length; j++) {
				//System.out.print(nums[i][j]+"|");
			//System.out.println(Arrays.toString(nums[i]));
	if(nums[i][j]>max) {
		max=nums[i][j];
		
		
	}
			
		}
			System.out.println(max);	
		}
	}

}
