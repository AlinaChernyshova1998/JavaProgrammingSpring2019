package day16_string_manipulation;

public class string_manipulation {
public static void main(String[] args) {
	String sentence="I wrote [5685852] lines of code today";
	int start=sentence.indexOf("[")+1;
	int end=sentence.indexOf("]");
	System.out.println(sentence.substring(start, end));
	// check if codeCound is more than 10
	String codeCount=sentence.substring(start, end);
	int count=Integer.parseInt(codeCount);
	if(count>20) {
		System.out.println("Wrote more than 20 lines of code!");
	}else {
		System.out.println("Not enough coding for today!");
	}
}
}
