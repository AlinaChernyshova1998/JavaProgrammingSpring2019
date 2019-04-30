package day_22_javarecap;

public class javaSubString {
public static void main(String[]args) {
	String word="java";
	System.out.println(word.substring(0,2));
	//print each char in separate line using substring
	System.out.println(word.substring(0,1));
	System.out.println(word.substring(1,2));
	System.out.println(word.substring(2,3));
	System.out.println(word.substring(3,4));
	System.out.println("&&&&&&&&&&&&&&&&&&&&");
	int i=0;
	System.out.println(word.substring(i,i+1));
	i++;
	System.out.println("&&&&&&&&&&&&&&&&&&&&");
	for(int n=0; n<=3;n++) {
	String letter=word.substring(n, n+1);
	System.out.println(letter);
		//print letters in reverse 
	//a
	//v
	//a
	//j
	
	}
	for(int n=3; n>=0; n--) {
		String letter=word.substring(n, n+1);
		System.out.println(letter);
	}
	int start=1;
	int end=10;
	String word2="UnitedStates";
	System.out.println(word2.substring(start, end));
	System.out.println(word2.substring(2,3));//i
	System.out.println(word2.substring(6,7));//S
	//pass single input. start only and will include until last
	System.out.println(word2.substring(6));
	//print last char
	String word3="apple";
	System.out.println(word3.substring(word3.length()-1));
	
}
}
