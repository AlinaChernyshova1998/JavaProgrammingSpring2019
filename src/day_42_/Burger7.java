package day_42_;
import java.util.*;
public class Burger7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Burger burger= new Burger();
burger.name="CowBoy";
String []ings = {"lettuce", "tomato","onion","beef","cheese"};
burger.ingredients=ings;
System.out.println(burger.name);
System.out.println(Arrays.toString(burger.ingredients));
//print first ingredients
System.out.println(burger.ingredients[0]);
System.out.println();
//using loop print each ingredient one by one
for(String each:burger.ingredients) {
	System.out.println(each);
}

	}

}
