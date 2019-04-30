package day30_methods2;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertWithMethods {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		timeConversion(scan.nextLine());
	}

	// 12:00:00PM
	public static void timeConversion(String s) {

		if (s.contains("12:00:00AM")) {
			System.out.println("00:00:00");
		} else if (s.contains("12:00:00PM")) {
			System.out.println("12:00:00");
		} else {
			String time24 = s.substring(0, s.length() - 2);
			String[] arr = time24.split(":");
			if (s.substring(s.length() - 2).equals("PM")) {
				// System.out.println(Arrays.toString(arr));
				int hours = Integer.parseInt(arr[0]) + 12;
				System.out.println(hours + ":" + arr[1] + ":" + arr[2]);

			} else if (s.substring(s.length() - 2).equals("AM")) {
				if (arr[0].contentEquals("12")) {
					System.out.println("00:" + arr[1] + ":" + arr[2]);
				} else {
					System.out.println(arr[0] + ":" + arr[1] + ":" + arr[2]);
				}

			}
		}

	}
}
