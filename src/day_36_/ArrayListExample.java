package day_36_;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//declare arrayList called languages
		ArrayList<String> languages=new ArrayList<>();
	languages.add("russian");
	languages.add("english");
	languages.add("spanish");
	languages.add("arabic");
	languages.add("french");
	languages.add("ukranian");
	System.out.println("Number of values: "+languages.size());
	System.out.println(languages.toString());//[russian, english, spanish, arabic, french, ukranian]
	
	}

}
