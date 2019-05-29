package day_51_;

public class Snowboarding extends Sport{
	public int perform(int minutes) {
		super.perform(10);//call super class version of method
		System.out.println("Snowboarding");
		this.calories = 15 * minutes;
		
		System.out.println("Snowboarding, you burning "+calories+" calories per "+minutes+" minutes");
		return calories;
	}
}
