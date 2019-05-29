package day_37_;
import java.util.*;
import java.util.ArrayList;

public class ArrayListShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> shopping=new ArrayList <>();
		shopping.add("shoes");
		shopping.add("dress");
		shopping.add("t-shirt");
		shopping.add("socks");
		shopping.add("tie");
		System.out.println("Total count: "+shopping.size());
		System.out.println(shopping.toString());
		//pring first and last item
		System.out.println("Print first item: "+shopping.get(0));
		System.out.println("Print last item: "+shopping.get(shopping.size()-1));
		//remove shoes item
		System.out.println(shopping.remove("shoes"));
		System.out.println(shopping.toString());
		System.out.println(shopping.get(0));//dress
		System.out.println(shopping.remove(0));
		
		for(String items:shopping) {
			System.out.println(items);
		}
		//remove all items at once
		shopping.clear();
		System.out.println(shopping.toString());
	}

}
