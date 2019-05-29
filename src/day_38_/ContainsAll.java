package day_38_;

import java.util.*;

public class ContainsAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums1 = new ArrayList<>();
		nums1.add(10);
		nums1.add(20);
		nums1.add(30);
		nums1.add(85);

		List<Integer> nums2 = new ArrayList<>();
		nums2.add(30);
		nums2.add(85);
		nums2.add(10);
		nums2.add(20);
		//test if nums1 contains nums2
		if (nums1.containsAll(nums2)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		System.out.println(nums2.containsAll(nums1));
		
		boolean b= nums1.containsAll(nums2) && nums2.containsAll(nums1);
		System.out.println(b);
		
		List<String>planA= new ArrayList<>();
		planA.add("java review");
		planA.add("replit");
		planA.add("pingpong");
		planA.add("food");
		planA.add("run");
		planA.add("sleep");
		
		List<String>planB= new ArrayList<>();
		planB.add("food");
		planB.add("run");
		planB.add("sleep");
		planB.add("java review");
		planB.add("pingpong");
		planB.add("replit");
		
		if (planB.containsAll(planA)&&planA.containsAll(planB)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
