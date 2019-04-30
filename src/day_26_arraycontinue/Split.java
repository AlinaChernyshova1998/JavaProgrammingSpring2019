package day_26_arraycontinue;

public class Split {
	public static void main(String[] args) {
		String words = "java,cava,html,selenium";
		String[] word = words.split(",");
		System.out.println("Count: " + word.length);
		for (int i = 0; i < word.length; i++) {
			System.out.println(word[i]);
		}
		String diceResult = "1 - 20 of 1,461 positions";
		String[] result = diceResult.split(" ");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		System.out.println(result[4]);
		String[] results = diceResult.split("of");
		for (int i = 0; i < results.length; i++) {
			System.out.println(results[i]);
		}
		String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
		String[] letters = sentence.split("I ");
		for (int i = 0; i < letters.length; i++) {
			System.out.println(letters[i]);
		}

		System.out.println("&&&&&&&&&&&&&&&&&");
		String[] Allwords = sentence.split(" ");
		for (int i = 0; i < Allwords.length; i++) {
			System.out.println(Allwords[i]);
		}
		String wordss = "java";
		char[] char1 = wordss.toCharArray();
		for (char ch : char1) {
			System.out.println(ch);
		}
	}
}