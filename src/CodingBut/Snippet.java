package CodingBut;

public class Snippet {
	public static void main(String[]args) {
		System.out.println(reverseLetters("a,b$c"));
	}

	public static String reverseLetters(String word){
			
		String letter="abcdefghijklmnopqrstuvwxyz";
		
		
			for(int i=word.length()-1; i>=0; i--){
			  if(word.startsWith(letter)&& word.endsWith(letter)){
			word+=word.charAt(i);
			
			  }
		}
			return word;
	
}
}
