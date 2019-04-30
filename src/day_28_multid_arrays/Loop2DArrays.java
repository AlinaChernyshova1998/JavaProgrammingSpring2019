package day_28_multid_arrays;

import java.util.Arrays;

public class Loop2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] pizzas = { { "pineapple", "fourcheese" }, { "mushroom", "chicken" },
				{ "tomatoes", "onions", "peppers" } };
		for (String[] pizza : pizzas) {
			System.out.print(pizza.length + "-");
			System.out.println(Arrays.toString(pizza));
			System.out.println("&&&&For loop&&&&");
		}
		for (int i = 0; i < pizzas.length; i++) {
			System.out.print(pizzas[i].length + "-");
			System.out.println(Arrays.toString(pizzas[i]));
		}
		for (String topping : pizzas[2]) {
			System.out.println(topping);
		}
		int[][] students = { { 4, 5, 6 }, { 8, 2, 3 }, { 12, 18, 20 } };
		for (int[] group : students) {
			for (int studentID : group) {
				System.out.print(studentID + ",");
			}
			System.out.println();
		}
		int [][]nums= {{10,20}, {20,30,40,50},{10,200,400},{555,999,556,444}};
		for(int i=0; i<nums.length;i++) {
			for(int j=0; j<nums[i].length; j++) {
				System.out.println(nums[i][j]+" ");
			}
			System.out.println();
		}

}
}