package day_51_;

public class Juijuitsu extends Sport{
	public int perform(int minutes) {
		System.out.println("Juijuitsu");
		this.calories = 12 * minutes;
		System.out.println("Doing Juijuitsu, you burning "+calories+" calories per "+minutes+" minutes");
		return calories;
	}
}
