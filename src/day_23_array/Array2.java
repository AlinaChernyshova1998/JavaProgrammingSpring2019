package day_23_array;

public class Array2 {
public static void main(String[] args) {
	String [] names=new String[5];
	String[]names2= {"Bill","Roman", "Vlad","Shaun","Maria"};
	System.out.println(names2[4]);
	System.out.println("Number of items: "+names2.length);
	
	String [] countries= {""};
	//double [] values
	countries[0]="USA";
	String [] fruits=new String[] {"apple","kiwi","oranges"};
	for(String fruit:fruits) {
		System.out.println(fruit);
	}
}
}
