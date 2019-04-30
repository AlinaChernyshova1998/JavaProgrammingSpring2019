package day_31_methods;

import java.util.Arrays;

public class MethodsWithStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
countWords("Java is fun and i know why");
googleSearch("About 16,600,000 results (0.73 seconds)");
	}
public static void countWords(String sentence) {
	
	String [] words=sentence.split(" ");
	System.out.println("Words in this sentence: "+Arrays.toString(words));
	System.out.println("Number of words: "+words.length);
	

	
}
public static void googleSearch(String result) {
	String [] word1=result.split(" ");
	
	System.out.println("Words in this sentence: "+Arrays.toString(word1));
	String count=word1[1].replace(",","");
	String sec= word1[3].replace("(", "");
	System.out.println("Result count: "+count);
	System.out.println("Result count: "+sec);
}
}
