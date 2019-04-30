package day_27_arrayrecap;

import java.util.Scanner;

public class WarmUptest {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int[] time1 = new int[2];// 0.0
		int[] time2 = new int[2];// 0.0
		// System.out.println(time1[0]);
		time1[0] = 10;
		time1[1] = 15;
		time2[0] = 10;
		time2[1] = 16;
		if (time1[0] < 0 || time1[0] > 23) {
			System.out.println("Invalid number hour ");
			return;
		}
		if (time1[1] < 0 || time1[1] > 59) {
			System.out.println("Invalid number minutes");
			return;
		}
		if (time2[0] < 0 || time2[0] > 23) {
			System.out.println("Invalid number hour ");
			return;
		}
		if (time2[1] < 0 || time2[1] > 59) {
			System.out.println("Invalid number minutes");
			return;
		}
		if (time1[0] > time2[0] ) {
			System.out.println("Time 1 is earlier");

		} else if (time2[0] > time1[0]) {
			System.out.println("Time 2 is earlier");
		
		} else {
			if (time1[1] < time2[1]) {
				System.out.println("Time 1 is earlier");

			} else if (time2[1] < time1[1]) {
				System.out.println("Time 2 is earlier");

			} else {
			
				System.out.println("Same time");
			}
		}
	}
}