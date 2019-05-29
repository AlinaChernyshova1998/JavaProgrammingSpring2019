package day_38_;
import java.util.*;
public class AddAllList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list1= new ArrayList<>();
list1.add("Java");
list1.add("SQl");
List<String> list2= new ArrayList<>();
list2.add("Phyton");
list2.add("JavaScrip");
System.out.println(list1.toString());
System.out.println(list2.toString());
//copy all values from list1 to list2
list1.addAll(list2);
System.out.println(list1);
//copy one more time all values from list1 to list2
list1.addAll(list2);
System.out.println(list1);
	}

}
