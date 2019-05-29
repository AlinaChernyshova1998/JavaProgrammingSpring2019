package day_38_;
import java.util.*;
public class FindSumIntoNewArrayList {

	public static void main(String[] args)
	{
	ArrayList<Integer> nums= new ArrayList<>();

	nums.add(3);
	nums.add(4);
	nums.add(-5);
	
	
	
System.out.println(appendPosSum (nums));	
	}
	//create your method below
	public static ArrayList<Integer> appendPosSum ( ArrayList<Integer> nums){
		ArrayList<Integer> sums= new ArrayList<>();
		
		int sum=0;
	  for(int i=0; i<nums.size(); i++){
	   if(nums.get(i)>0) {
		 sum+=nums.get(i);
		 sums.add(nums.get(i));
	   }
	  }
	  sums.add(sum); 
return sums;
	} 
}
