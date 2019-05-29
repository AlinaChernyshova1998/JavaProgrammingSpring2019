package day_51_;

public class Running extends Sport {
	public int perform(int minutes) {
		System.out.println("Running" );
		this.calories = 10 * minutes;
		System.out.println("Running, you burning "+calories+" calories per "+minutes+" minutes");
		return calories;
	}
}
