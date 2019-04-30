package day_19_transaction;

public class palindrome {
public static void main(String[] args) {
	String word="alina";
	String reversed="";
	int word1=word.length()-1;
	while(word1>=0) {
		reversed=reversed+word.charAt(word1);
		word1--;
	}	
		System.out.println(reversed);
		if (reversed.equalsIgnoreCase(word)) {
			System.out.println("It is palindrome");
		}
		
		System.out.println("It is not palindrome");
	
}
}
