package array_24_;

import java.util.Arrays;

public class CarShop {
	public static void main(String[] arg) {
		// Mercedes, Honda, BMW, Tesla, KIA
		// 1. step: create an array of strings and store cars this inside that array
		String[] cars = { "BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla" };
		// 2. step: print cars names that starts with M
		for (String car : cars) {
			if (car.startsWith("M")) {
				System.out.println(car);
				// 3. step: print all cars that contains letter R somewhere in the name
			}
		}
		System.out.println("************");
		for (String make : cars) {
			if (make.toLowerCase().contains("r")) {
				System.out.println(make);
				// 4. step: print car names that ends with a

			}
		}
		System.out.println("************");
		for (String end : cars) {
			if (end.endsWith("a")) {
				System.out.println(end);
				// 5. step: print all cars that have at least 6 letters
			}
		}
		System.out.println("************");
		for (String has6letters : cars) {
			if (has6letters.length() > 5) {
				System.out.println(has6letters);
				// 6. step: swap first and last value in the array
			}
		}
		System.out.println("************");
		String swap = cars[0];
		cars[0] = cars[cars.length - 1];
		cars[cars.length - 1] = swap;
		System.out.println(Arrays.toString(cars));
		Arrays.sort(cars);
		System.out.println("After sorting:");
		
	}
}
