package day_38_;
import java.util.*;
public class RemoveAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list1= new ArrayList<>();
list1.add(30);
list1.add(20);
list1.add(22);

List<Integer> list2= new ArrayList<>();
list2.add(30);
list2.add(202);
list2.add(25);
list2.add(39);
list2.add(26);
list2.add(22);
list2.add(20);
System.out.println(list1.toString());
System.out.println(list2.toString());
//remove all nums of list1  from list2  
list2.removeAll(list1);
System.out.println(list2.toString());
	}

}
