package day_31_methods;

public class PrintStars {
	public static void printHollowRect() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
			if (j == 0 || j == 4) {
				System.out.println("*****");
			}else {
						System.out.println("*   *");

					}
				}
			break;
			}
		}

	

	public static void main(String[] args) {

		printHollowRect();
	}
}
