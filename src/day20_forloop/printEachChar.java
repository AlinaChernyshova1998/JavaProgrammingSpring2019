package day20_forloop;

public class printEachChar {
public static void main(String[]args) {
	String word="Wooden Spoon";
	
	for(int i=0;i<word.length(); i++ ) {
		System.out.println(word.charAt(i));
	}
//using for loop print only vowel(a,e,o,i,u)
	for(int i=0;i<word.length(); i++ ) {
		char letter=word.toLowerCase().charAt(i);
		if(letter=='a'|| letter=='e'|| letter=='o'||letter=='i'||letter=='u') {
			System.out.print(letter+",");
		}
	
		//using the for loop print only consonants
		for( i=0;i<word.length(); i++ ) {
			 letter=word.toLowerCase().charAt(i);
			if(!(letter=='a'|| letter=='e'|| letter=='o'||letter=='i'||letter=='u')) {
				System.out.print(letter+",");
			}
		}
	}
}	
}