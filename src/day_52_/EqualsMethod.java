package day_52_;

public class EqualsMethod {
public static void main(String[] args) {
	Computer comp1= new Computer("iMac", "silver");
	Computer comp2= new Computer("iMac", "silver");
	Computer comp3=comp2;
	
	System.out.println(comp1==comp2);/*false , they pointing on different memory location, 
	                                   their data is matching, but they pointing on different locations in memory*/
	System.out.println(comp1.equals(comp2));
	
	System.out.println(comp3==comp2);
	System.out.println(comp3.equals(comp2));
	
	String str1= "java";
	String str2= new String("java");
	System.out.println(str1==str2);//false //checking only if they have same location in the memory
	System.out.println(str1.equals(str2));//true // checking values in the String str1 and str2
}
}
