package day_25_Array_in_java;

public class ShoppingArray {
	public static void main(String[] args) {
		String[] products = { "shoes", "dress", "t-shirts", "Apple watch", "gucci bag" };
		double[] price = { 52, 150, 25, 350, 2500 };
		int[] itemsId = { 125, 1236, 126, 127, 122 };
		System.out.println("Products count: " + products.length);
// check if products price and items have same count
		if (products.length == price.length && itemsId.length == products.length) {
			System.out.println("Shopping list looks good!");
		} else {
			System.out.println("Something wrong!");
			return;
		}
//loop though products and print each one in separate line
		for (String product : products) {
			System.out.println(product);

		}
		System.out.println("&&&&&&&&&&&&&");
		// price==>for loop
		for (int i = 0; i <= price.length - 1; i++) {
			System.out.println(price[i]);
		}
		System.out.println("&&&&&&&&&&&&&");
		// itemId==> print this in reverse order using a loop
		for (int idx = itemsId.length - 1; idx >= 0; idx--) {
			System.out.println(itemsId[idx]);
		}
		// print and report with a total price
		// Iteam1: 125 -shoes-$52
		System.out.println("&&&&&&&&&&&&&");
		double totalPrice = 0;
		for (int j = 0; j <= products.length - 1; j++) {
			System.out.println("Item " + (j + 1) + ": " + itemsId[j] + " - " + products[j] + " - $" + price[j]);
			totalPrice += price[j];

		}
		System.out.println("Total price: $" + totalPrice);
		// find the most exspensive product
		double maxPrice = 0;
		int maxIndex=0;
		for (int a = 0; a < price.length; a++) {
			if (price[a] > maxPrice) {
				maxPrice=price[a];
				maxIndex=a;

			}
		}
		System.out.println(itemsId[maxIndex]+"-"+products[maxIndex]+"- $"+maxPrice);
	}
}
