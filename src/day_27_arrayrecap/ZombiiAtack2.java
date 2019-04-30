package day_27_arrayrecap;
import java.util.*;

public class ZombiiAtack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();
		}

		int day = 0;
		System.out.println("Day " + day + " " + Arrays.toString(inhabitants));

		while (true) {
			for (int i = 0; i < inhabitants.length - 1; i++) {
				if (inhabitants[i] != 0 && inhabitants[i + 1] == 0) {
					inhabitants[i] = inhabitants[i] / 2;
				} else if (inhabitants[i] == 0 && inhabitants[i + 1] != 0) {
					inhabitants[i + 1] = inhabitants[i + 1] / 2;
					i++;
				}
			}
			day++;
			System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
			int count = 0;
			for (int j = 0; j < inhabitants.length; j++) {
				if (inhabitants[j] == 0) {
					count++;
				}
			}
			if (inhabitants.length == count) {
				System.out.println("---- EXTINCT ----");
				break;
			}

		}
	}

}
