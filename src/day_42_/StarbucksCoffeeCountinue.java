package day_42_;

public class StarbucksCoffeeCountinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StarbucksCoffee  coffee= new StarbucksCoffee ();
		coffee.nameCoffee="Ice Caramel Mochiatto";
		coffee.size="grande";
		coffee.calories=500;
		coffee.price=4.85;
		coffee.getCoffeeInfo();
		
		StarbucksCoffee  coffee2= new StarbucksCoffee ();
		coffee2.Setname("White Chocolate Mocha");
		coffee2.size="tall";
		coffee2.calories=200;
		coffee2.price=3.85;
		coffee2.getCoffeeInfo();
		
		StarbucksCoffee  coffee3= new StarbucksCoffee ();
		coffee3.Setname("Coffe Mocha");
		coffee3.Setsize("grande");
		coffee3.Setcalories(360);
		coffee3.Setprice(4.65);
		System.out.println("Cofee3 name: "+coffee3.nameCoffee);
		coffee3.getCoffeeInfo();
		
		StarbucksCoffee  coffee4= new StarbucksCoffee ();
		coffee4.SetCoffeeName("Flat white", "tall", 3.95, 170);
		coffee4.getCoffeeInfo();
	}

}
