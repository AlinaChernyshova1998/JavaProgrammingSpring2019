package array_24_;

import java.util.Arrays;

public class LotteryTicket {
	public static void main(String[] args) {
		int[] lotteryNumbers = { 12, 45, 62, 42, 52, 90 };
		System.out.println(Arrays.toString(lotteryNumbers));
		Arrays.sort(lotteryNumbers);
		System.out.println(Arrays.toString(lotteryNumbers));
		// binary search works only with sorted array
		int index = Arrays.binarySearch(lotteryNumbers, 52);
		System.out.println("Position:" + index);
		int index2 = Arrays.binarySearch(lotteryNumbers, 9);
		System.out.println("Position:" + index2);
	}
}
