package day_51_;

public class Sport {
	int calories;

	public int perform(int minutes) {
		System.out.println("Doing general exercise");
		this.calories = 4 * minutes;
		System.out.println("Doing general exercise, you burning "+calories+" calories per "+minutes+" minutes");
		return calories;
	}
	
}
