package day_41_;

public class CarContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Car car1= new Car();
 car1.make="Honda";
 car1.color="Silver";
 car1.currentSpeed=66;
 car1.model="Civic";
 System.out.println("Make: "+car1.make);
 System.out.println("Color: "+car1.color);
 System.out.println("Current Speed: "+car1.currentSpeed);
 System.out.println("Model: "+car1.model);
 car1.printCarInfo();
 car1.showCurrentSpeed(75);
 car1.drive();
 car1.accellerate(10);
 
 
	}

}
