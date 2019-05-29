package day_39_;

import java.util.*;

public class UniqueValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<>();
		// Scanner scan = new Scanner(System.in);
		// System.out.println("Enter your numbers: ");
		// nums.add(scan.nextInt());
		nums.add(10);
		nums.add(20);
		nums.add(10);
		nums.add(20);
		nums.add(5);
		nums.add(25);
		nums.add(25);
		nums.add(25);
		System.out.println(nums.toString());
		ArrayList<Integer> unique = new ArrayList<>();
		for (Integer num : nums) {
			// asssign num to unique if nums is not already there
			if (!unique.contains(num)) {
				unique.add(num);
			}
		}
		System.out.println(unique.toString());
		
		ArrayList<Integer> unique1 = new ArrayList<>();
		for(int i=0; i<nums.size(); i++) {
			int count=0;
			Integer value=nums.get(i);
			for(int j=0;i<nums.size(); i++) {
			if(nums.get(j)==value && i!=j ) {
				count++;
				break;
			}
			}
		if(count==0) {
			unique1.add(value);
			System.out.println(unique1.toString());
		}
		}
	}

}
