package day_38_;
import java.util.*;

public class EqualsArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> friends1= new ArrayList<>();
List<String> friends2= new ArrayList<>();
friends1.add("Alina");
friends1.add("Anna");
friends1.add("Gaziza");
friends1.add("Ivan");
friends1.add("Alim");

friends2.add("Alina");
friends2.add("Anna");
friends2.add("Gaziza");
friends2.add("Ivan");
friends2.add("Alim");
System.out.println(friends1.toString());
System.out.println(friends2.toString());
if(friends1.equals(friends2)) {
	System.out.println("True");
}else {
	System.out.println("False");
}

	}

}
