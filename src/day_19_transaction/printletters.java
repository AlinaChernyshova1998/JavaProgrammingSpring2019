package day_19_transaction;

public class printletters {
public static void main(String[] args) {
	String word="Amazon";
	//print each character one by one in separate line
	int index=0;
	while(index<word.length()) {
	System.out.println(word.charAt(index));
	index++;
	
}
	String word2="Amazon";
	int index2=word2.length()-1;//
	while(index2>=0) {
		System.out.println(word.charAt(index2));
		index2--;
	}
}
}