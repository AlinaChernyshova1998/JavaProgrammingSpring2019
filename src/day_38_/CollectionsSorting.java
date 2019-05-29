package day_38_;
import java.util.*;

public class CollectionsSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer>nums=new ArrayList<>();
nums.add(55);
nums.add(2);
nums.add(13);
nums.add(123);
System.out.println(nums.toString());
//sort nums
Collections.sort(nums);
System.out.println(nums.toString());

List<String> str= new ArrayList<>();
str.add("Alina");
str.add("Anna");
str.add("Ali");
str.add("Vlad");
str.add("Dina");
System.out.println(str.toString());
//sort names
Collections.sort(str);
System.out.println(str.toString());
//max and min
int maxnum=Collections.max(nums);
int minnum=Collections.min(nums);
System.out.println("Max value? "+maxnum);
System.out.println("Min value? "+minnum);
String maxName=Collections.max(str);
String minName=Collections.min(str);
System.out.println("Max value? "+maxName);
System.out.println("Min value? "+minName);

Collections.shuffle(str);
System.out.println(str.toString());
	}

}
