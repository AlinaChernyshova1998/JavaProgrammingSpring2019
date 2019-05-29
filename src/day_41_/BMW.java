package day_41_;

public class BMW {
String make="BMW";
String model;
double price;
public void showPrice() {
	if(model.equals("330i")) {
		price=40250;
		
	}else if( model.equals("740i")) {
		price=86540;
		System.out.println("Price for this model: "+price);
	}else if( model.equals("m3")) {
		price=66666;
		System.out.println("Price for this model: "+price);
	}else {
		System.out.println("I'm sorry we dont have this model");
		System.out.println("Price for this model: "+price);
	}
}
}
