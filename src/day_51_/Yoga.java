package day_51_;

public class Yoga extends Sport {
	public int perform(int minutes) {
		System.out.println("Doing general exercise");
		this.calories = 5 * minutes;
		System.out.println("Doing yoga, you burning "+calories+" calories per "+minutes+" minutes");
		return calories;
	}
}
