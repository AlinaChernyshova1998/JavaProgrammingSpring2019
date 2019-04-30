package day_23_array;

public class PrintletterswithmultiLoop {
	public static void main(String[] args) {
		// outer loop will repeat printing letters as many times as you want
		// in this case we gonna print 3 times
		// so we are repeating inner loop 3 times
		for (int j = 1; j <= 10; j++) {
			if (j % 2 == 0) {
				for (char ch = 'a'; ch <= 'z'; ch++) {
					System.out.print(ch + ",");
				}
			} else {
				for (char ch = 'z'; ch>= 'a'; ch--) {
					System.out.print(ch + ",");
				}
			}
			System.out.println();
			System.out.println("****************************");

		}

	}
}