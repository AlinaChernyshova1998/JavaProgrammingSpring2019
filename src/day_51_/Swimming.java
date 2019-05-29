package day_51_;

public class Swimming extends Sport{
	public int perform(int minutes) {
		System.out.println("Swimming");
		this.calories = 11 * minutes;
		System.out.println("Swimming, you burning "+calories+" calories per "+minutes+" minutes");
		return calories;
	}
}
