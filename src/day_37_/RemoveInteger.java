package day_37_;
import java.util.*;
public class RemoveInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>nums=new ArrayList<>();
nums.add(0);
nums.add(52);
nums.add(99);
nums.add(55);
nums.add(15);
nums.add(557);
System.out.println(nums.size());
System.out.println(nums.toString());
nums.remove(5);
System.out.println(nums.toString());
Integer n1= new Integer(5);
Integer n2= Integer.valueOf(5);
nums.remove(n1);
nums.remove(new Integer (4));
System.out.println(nums.toString());


	}

}
