package day_34_;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
printWords("alina", "anna");
shoppingList(1000, "apple watch", "avacado toast", "coffee","shoes");
cook("vareniky", "eggs,flour, water, salt, kefir, potato");
System.out.println(sum(2,55,6,4));
int budget=200;
if(sum(10,45,100,35)<=budget) {
	System.out.println("Within budget");
}else {
	System.out.println("Broke");
}
int total=sum(123,55);
System.out.println("Total: "+total);

String [] myPets= {"cat", "dog", "camel", "bird"};
printWords(myPets);
	}
public static void printWords(String... word) {
	for (String words:word) {
	System.out.println(words);	
	}
}
public static int sum(int... nums) {
	
	int sum=0;
	for(int n: nums) {
		sum+=n;
	}
	return sum;
	
}
public static void cook(String dish, String...ingredients) {
	System.out.println();
	System.out.println("------RECIPE "+dish.toUpperCase()+ "------- and here is engredients: "+Arrays.toString(ingredients));
	
}
public static void shoppingList(int Totalprice, String ...items) {
	System.out.println("Total cost: "+Totalprice);
	System.out.println(Arrays.toString(items));
}
}
