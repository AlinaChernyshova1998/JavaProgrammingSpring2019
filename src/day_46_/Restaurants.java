package day_46_;

public class Restaurants {
	public static void main(String[] args) {
		Dinner mom = new Dinner();
		Dinner kid = new Dinner();
		Dinner dad = new Dinner();
		System.out.println("Total slices: " + Dinner.pizzaSlices);
		mom.takeSlice();
		kid.takeSlice();
		dad.takeSlice();
		System.out.println("Total slices: " + Dinner.pizzaSlices);
		System.out.println("Total slices: " + mom.pizzaSlices);
		kid.takeSlice(3);
		dad.takeSlice(2);
		//mom.takeSlice();
		System.out.println("Total slices: " + mom.pizzaSlices);
	}
}
