package day_52_;

import java.util.*;

public class FinalArrayList {
	
	final static public String words="Pink";
	/* public -> access modifiers
	 * final, static-> non-access modifiers
	 */
	
	
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("orange");
		words.add("grey");
		words.add("white");
		words.add("pink");
		System.out.println(words.toString());
		words.add("black");
		words= new ArrayList<>();
		System.out.println(words.toString());//empty
		words.add("blue");
		words.add("red");
		words.add("yellow");
		System.out.println(words.toString());
		
		//make final arrayList
		final ArrayList<String> word = new ArrayList<>();
		word.add("orange");
		word.add("grey");
		word.add("white");
		word.add("pink");
		System.out.println(words.toString());
		word.add("black");
		//word= new ArrayList<>();//not compile
		//System.out.println(words.toString());//empty
		

	}
}
