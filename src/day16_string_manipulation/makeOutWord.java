package day16_string_manipulation;

import java.util.Scanner;

public class makeOutWord {

	public static void main(String[] args) {
	
			String chars = "{{}}";
			String word = "java";
			String result;
			System.out.print(chars.charAt(0));
			System.out.print(chars.charAt(1));
			System.out.print(word);
			System.out.print(chars.charAt(2));
			System.out.println(chars.charAt(3));
		
		String chars1= "[[]]";
		String word1 = "java";
		String result1 = chars1.substring(0, 2) + word1 + chars1.substring(2);
		System.out.println(result1);
		
		

	}
}