package day_42_;

public class StarbucksCoffee {
	String nameCoffee;
	String size;
	int calories;
	double price;


	public void getCoffeeInfo() {
		String info = "Name: " + nameCoffee + ", size: " + size.toUpperCase() + ", calories: " + calories + ", price: "
				+ price + "$";
		System.out.println(info);
	}

	public void Setname(String newName) {
		nameCoffee = newName;

	}

	public void Setsize(String newSize) {
		if (newSize.equalsIgnoreCase("Tall") || newSize.equalsIgnoreCase("grande")
				|| newSize.equalsIgnoreCase("venti")) {
			size = newSize;
		} else {
			System.out.println("I'm sorry, we dont have this size availble");
			size="unknown";
		}	
	}

	public void Setprice(double newPrice) {
		price = newPrice;
	}

	public void Setcalories(int newCalories) {
		calories = newCalories;
	}
	public void SetCoffeeName(String newName, String newSize, double newPrice, int newCalories) {
		nameCoffee=newName;
		Setsize(newSize);
		price=newPrice;
		calories=newCalories;
		
		
	}
}