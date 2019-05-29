package day_38_;
import java.util.*;
public class MethodsSummary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list = new ArrayList<>();
list.add("red");
list.add("blue");
list.add("orange");
list.add("black");
//add new color on position 0
list.add(0, "pink");
//toString print all values
System.out.println(list.toString());
//size method
System.out.println(list.size());
//get method
System.out.println(list.get(0));
//remove using index.removes value from index position
list.remove(0);
System.out.println(list.toString());
//remove using value/elements
list.remove("blue");
System.out.println(list.toString());
//set(index,value) replace certain index with new value
list.set(0, "yellow");
System.out.println(list.toString());
//indexOf
System.out.println("yellow: "+list.indexOf("yellow"));
System.out.println("green: "+list.indexOf("green"));
//isEmpty() returns true if list is empty
System.out.println("is List empty? "+list.isEmpty());
// CONTAINS(element) ==> returns true if value is present ;
System.out.println("black in list? "+list.contains("black"));

List<String> list2= new ArrayList<>();
//AddAll--> add all value from one list to others
list2.addAll(list);
System.out.println(list2.toString());
//Contains All
System.out.println("Is list contains All values in list2? "+list.containsAll(list2));
//equals
System.out.println("Is list equals values in list2? "+list.equals(list2));

list2.add("pink");
//removeAll (list) . removes all matching values from you list
list2.removeAll(list);
System.out.println(list2.toString());

//ADDALL(index. list) adds new value starts from given index
list2.addAll(0,list);
System.out.println(list2.toString());

//clear all
list.clear();
list2.clear();
System.out.println("both empty? "+(list.isEmpty()&& list2.isEmpty()));




	}

}
