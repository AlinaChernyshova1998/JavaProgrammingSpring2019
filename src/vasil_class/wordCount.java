package vasil_class;

import java.util.Arrays;

public class wordCount {
	public static void main(String[] args) {
		System.out.println(wordCount("foo bar allo i ffff"));

	}

	public static int wordCount(String words) {
		String[] word = words.split(" ");
		System.out.println(Arrays.toString(word));
		int count = 0;

		for (int i = 0; i < word.length; i++) {
			count++;
		}
		return count;

	}

}
