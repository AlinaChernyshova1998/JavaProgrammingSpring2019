package day_23_array;

public class PrintWord {
public static void main(String[] args) {
	String word="java";
	//condition
	for(int i=0; i<=word.length()-1;i++) {
		//update statement
		if(word.substring(i, i+1).equals("a")) {
			//if condition is true, go back to update statement
			continue;
		}
		System.out.println(word.substring(i, i+1));
	}
		
}
}
