package day_37_;
import java.util.*;
public class ArraysAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
ArrayList<String> cars = new ArrayList<>();
cars.add("Tesla");
List<Integer> nums = Arrays.asList(4,25,6,9);
System.out.println(nums.size());
System.out.println(nums.toString());
//nums.add(100);//u can't add new integer
System.out.println(nums.toString());
//reate arrayList prices
//asign values using Arrays.aslist
List<Double> price=Arrays.asList(12.3,55.6,89.23,23.00,150.02);
System.out.println(price);
//calculate the sum
double sum=0;
for(int i=0; i<price.size(); i++) {
	sum+=price.get(i);
	
}
System.out.println(sum);
//add new list expensive
//add prices that are more than 100
List<Double> expensive= new ArrayList<>();
for(double price1:price) {
	if(price1>100.0) {
		expensive.add(price1);
	}
}
System.out.println("Expencive: "+expensive);
	}
}
