package PopularJavaSolutions;

public class Fibonacci {

	public static void main(String[] args) {
		// QUESTION : find first 10 items in Fibonacci series starting from 0
		// : find the total of 10 numbers

	}

	public static int Fibonaccies(int e1, int e2, int n) {
		int sum = 0;
		System.out.println("First " + n + " elements: ");
		for (int i = 0; i <= n; i++) {
			System.out.print(e1 + " ");
			sum = e1 + e2;
			e1 = e2;
			e2 = sum;

		}
		System.out.println();// empty line
		return sum;
	}

}
