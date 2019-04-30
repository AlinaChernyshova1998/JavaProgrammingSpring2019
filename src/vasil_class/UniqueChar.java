package vasil_class;

public class UniqueChar {
	public static void main(String[] args) {
		// test your code
		System.out.println(uniqueChars("wooden-spoon"));
	}

	public static String uniqueChars(String str) {
		// TODO: write your below
		String unique = "";
		for (int i = 0; i < str.length(); i++) {
			if (unique.contains(str.substring(i, i + 1))) {
				unique += str.substring(i, i + 1);
			}
		}
		return unique;
	}
}
