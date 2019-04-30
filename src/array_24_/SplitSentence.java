package array_24_;

public class SplitSentence {
	public static void main(String[] args) {
		String sentence = "Java is a general-purpose computer-programming language that is concurrent, class-based, object-oriented, and specifically designed to have as few implementation dependencies as possible.";
		String[] word = sentence.split(" ");// " "-limit of sentence
		int counter = 0;
		for (String str : word) {
			// System.out.println(str);
			if (str.equals("language")) {

				break;

			}
			counter++;
		}
		System.out.println("Position:" + counter);
		System.out.println(word[counter]);
		// System.out.println("***********");
		// System.out.println(word[0]);

	}

}
