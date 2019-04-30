package day_23_array;
import java.util.Scanner;
public class PrintWordWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
String word="";
String concat="";
for(int i=0; i<6; i++) {
	System.out.println("Print a words: ");
	word=scan.next();
	if(word.contentEquals("java")){
	continue;
	
	
	
}
	concat+=word+",";
	
	}
     System.out.println(concat.substring(0, concat.lastIndexOf(",")));
}
}