package day_41_;
import java.util.*;
public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> nums= new ArrayList<>();
nums.add(3);
nums.add(5);
nums.add(7);
 
System.out.println(doubleTheList(nums));
	}
public static ArrayList<Integer> doubleTheList(ArrayList<Integer> nums){
	for(int i=0; i<nums.size(); i++) {
		nums.set(i, nums.get(i)*2);
		
	}
	return nums;
	
}
}
