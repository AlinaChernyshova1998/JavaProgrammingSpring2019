package day_40_;

public class BestBuy {
	public static void main(String[] args) {
		//System.out.println(brand); not compile
		SmartPhone cell1= new SmartPhone();
		System.out.println(cell1.brand);//null
		System.out.println(cell1.screenSize);//0.0
		cell1.brand="Nokia 6200";
		cell1.screenSize=2.0;
		cell1.color="red";
		cell1.price=76.25;
	
		System.out.println("Brand: "+cell1.brand);
		System.out.println("Screen Size: "+cell1.screenSize);
		System.out.println("Color: "+cell1.color);
		System.out.println("Price: "+cell1.price);
		cell1.color="silver";
		System.out.println("Color: "+cell1.color);
		SmartPhone cell2= new SmartPhone();
		cell2.brand="Samsung";
		cell2.color="black";
		cell2.price=99.99;
		cell2.screenSize=5.5;
		System.out.println("Brand: "+cell2.brand);
		System.out.println("Screen Size: "+cell2.screenSize);
		System.out.println("Color: "+cell2.color);
		System.out.println("Price: "+cell2.price);
		System.out.println("### CALLING METHODS ###");
		cell1.call();
		cell1.message();
		cell2.call();
		cell2.message();
		cell2.call();
		cell1.takePhoto();
		cell2.takePhoto();
	}
}
