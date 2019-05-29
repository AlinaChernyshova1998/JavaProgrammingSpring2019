package day_39_;
import java.util.*;
public class WarmUP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> cities = new ArrayList<>();
        cities.add("Lima");
        cities.add("Tokyo");
        cities.add("New York");
        cities.add(0,"Paris");
        cities.add("Pittsburgh");
        cities.add(1,"Berlin");
        cities.add("Madrid");
        cities.add("Moscow");
        cities.add("Istanbul");
        cities.add("Washington D.C.");
        cities.add("Amsterdam");
        cities.add("Zurich");
        cities.add("Singapore");
        cities.add("Milan");
        cities.add("Toronto");
        cities.add("London");
        System.out.println(cities.toString());
        //separated by |
        for(String city:cities) {
        	System.out.print(city+"|");
        }
        System.out.println();
        //print each city all uppercase
        for(String city:cities) {
        	System.out.print(city.toUpperCase()+"|");
        } 
        //make all uppercase
        System.out.println();
        String paris=cities.get(0).toUpperCase();
        cities.set(0, paris);
        System.out.println(cities.get(0));
        cities.set(1, cities.get(1).toUpperCase());
        System.out.println(cities.get(1));
        System.out.println();
        for(int i=0; i<cities.size(); i++) {
        	String city=cities.get(i).toUpperCase();
        	cities.set(i, city);
        	
        }
        System.out.println(cities.toString());
        //find longerst cities
        String longer=cities.get(0);
       
        for(String city: cities){
        	if(city.length()>longer.length()) {
        		longer=city;
        	}
        }
        System.out.println(longer);
        //print shorter city
        String shorter=cities.get(0);
        for(String city1: cities){
        	if(city1.length()<shorter.length()) {
        		shorter=city1;
        	}
        }
        System.out.println(shorter); 
        System.out.println();
        ArrayList<String> citiesMorethen6= new ArrayList<>();
      
        //assign all cities that have more then 6 char
        for(String city:cities) {
        	if(city.length()>6) {
        		   citiesMorethen6.add(city);
        	}
        	}
        	System.out.println( citiesMorethen6);
        }
 
	

}
