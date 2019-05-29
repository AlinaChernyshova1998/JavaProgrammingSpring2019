package day_41_;

public class Microwave {
	String brand;
	boolean isOn;

	public void turnOn() {
	
		if (isOn == true) {
			System.out.println("Turning on the microvawe");
			System.out.println(brand + " It is already on");
		}
	}

	public void turnOff() {
	
		if (isOn == false) {
			System.out.println("Turning off the microvawe");
			System.out.println(brand + " It is already off");
		}
	}

	public void heat() {
		if (isOn == true) {
			System.out.println("Heating the pizza");
		} else {
			System.out.println("To heat your food, turn on the microwave");
		}
	}
}