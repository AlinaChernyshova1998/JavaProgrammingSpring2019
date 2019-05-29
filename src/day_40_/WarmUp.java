package day_40_;

import java.util.*;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "alina";
		ArrayList<String> str = new ArrayList<>();
		str.add("alina");
		str.add("anna");
		str.add("alina");
		str.add("alina");
		str.add("alina");
		str.add("al");
		System.out.println(countOccurances(str, word));
	}

	public static int countOccurances(ArrayList<String> str, String word) {

		int count = 0;
		for (String str1 : str) {
			if (str1.equals(word)) {
				count++;
			}
		}
		return count;

	}
}
