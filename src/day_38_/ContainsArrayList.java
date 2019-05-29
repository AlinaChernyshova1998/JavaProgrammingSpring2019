package day_38_;
import java.util.*;
public class ContainsArrayList {
public static void main(String [] args) {
	ArrayList<String> list1=new ArrayList<>();
	list1.add("January");
	list1.add("February");
	list1.add("Match");
	list1.add("April");
	list1.add("May");
	System.out.println(list1.toString());
	
	//copy all values from list1 to month
	ArrayList<String> month=new ArrayList<>(list1);
	//add new items to month and print arraylist
	month.add("June");
	month.add("July");
	month.add("August");
	month.add("September");
	month.add("October");
	month.add("November");
	month.add("December");
	
	System.out.println(month.toString());
	//contains method
	System.out.println(month.contains("January"));
	System.out.println(month.contains("May"));
	//loop to print all month in seperate line
	for(int i=0; i<month.size(); i++) {
		System.out.println("All month in seperate line: "+month.get(i));
	}
	//how would you check is February is in second position
	System.out.println(month.indexOf("February")==1);
	System.out.println(month.get(1).equals("February"));
	
	ArrayList<String> month2=new ArrayList<>(list1);
	System.out.println("Month: "+month.toString());
	System.out.println("Month2: "+month2.toString());
	//compare if month
	if(month.containsAll(month2)) {
		System.out.println("Thats correct");
	}else {
		System.out.println("Thats false");
	}
	//add one more January to month2
	month2.add("January");
	if(month.containsAll(month2)) {
		System.out.println("Thats correct");
	}else {
		System.out.println("Thats false");
	}
}
}
