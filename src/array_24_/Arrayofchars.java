package array_24_;

public class Arrayofchars {
	public static void main(String[] args) {
		char[] values = { 'a', 'b', 'c' };
		for (char value : values) {
			System.out.println(value);
		}
		String str = "Wooden spoon";
		// this method toCharArray converts string intro
		// array of characters
		char[] chars = str.toCharArray();
		for (char c : chars) {
			System.out.print(c + "_");
		}
		System.out.println();
		str = "";
		for (int i = chars.length - 1; i >= 0; i--) {
			str += (chars[i]);
		}
		System.out.println(str);
		// print char with help of array of char one by one if char is == 'o' replace it
		// with *;

		String a = "Wooden spoons";
		char[] chr = a.toCharArray();
		for (char b : chr) {
			if (b == 'o') {
				System.out.print("*");
			}else{
				System.out.print(b)	;
			}
			

			}
		

	}
}
