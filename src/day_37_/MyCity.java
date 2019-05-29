package day_37_;
import java.util.*;
public class MyCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> city=new ArrayList<>();
city.add("Barnaul");
city.add("Dushanbe");
city.add("Kiev");
city.add("Baku");
city.add("Astana");
//print each city using for each loop separated by space
for(String cities: city) {
	System.out.print(cities+" ");	
}
System.out.println();
for(int i=0; i<city.size(); i++) {
	System.out.print(city.get(i)+" ");	
}
System.out.println();
//remove Baku
city.remove("Baku");
System.out.println(city.toString());
//isEmpty?
System.out.println("Is list empty? "+city.isEmpty());
//add new city on the top
city.add(0, "Iran");
System.out.println(city.toString());
city.add(1,"Seoul");
System.out.println(city.toString());
//replace city to another city
city.set(3, "Moscow");
System.out.println(city.toString());
int idx =city.indexOf("Astana");
System.out.println("Astana index: "+idx);
city.set(5, "Odessa");
System.out.println(city.toString());
//clean everything
city.clear();
//check if is empty?
System.out.println(city.isEmpty());
System.out.println(city.toString());

	}

}
