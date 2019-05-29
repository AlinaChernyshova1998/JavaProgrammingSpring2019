package day_39_;

import java.util.*;

public class CustomListMethods {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(52);
		nums.add(95);
		printList(nums);

		ArrayList<Double> num = new ArrayList<>();
		num.add(10.2);
		num.add(1.23);
		num.add(52.3);
		num.add(95.00);
		System.out.println(sumList(num));

		System.out.println(getList(10));
		System.out.println(getRandomList(10));

		
		ArrayList<String> str = new ArrayList<>();
		   str.add("56");
		   str.add("99");
		System.out.println(convertToIntList(str));	
	}

	public static void printList(ArrayList<Integer> nums) {
		for (Integer i : nums) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static double sumList(ArrayList<Double> num) {
		double sum = 0;
		for (int i = 0; i < num.size(); i++) {
			sum += num.get(i);

		}

		return sum;
	}

	public static ArrayList<Integer> getList(int size) {
		ArrayList<Integer> nums = new ArrayList<>();

		for (int i = 1; i <= size; i++) {
			nums.add(i);

		}
		return nums;

	}

//random nums
	public static ArrayList<Integer> getRandomList(int size) {

		Random random = new Random();
		ArrayList<Integer> randomNums = new ArrayList<>();
		for (int i = 1; i < size; i++) {
			randomNums.add(random.nextInt(101));

		}
		return randomNums;
	}

	public static ArrayList<Integer> convertToIntList(ArrayList<String> str) {
		ArrayList<Integer> str1=new ArrayList<>();
		for(String str2:str){
			str1.add(Integer.parseInt(str2));
			
		}
		
		return str1;

	}
}
