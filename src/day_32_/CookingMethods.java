package day_32_;
import java.util.*;
public class CookingMethods {
public static void main(String[] args) {
	makePancakes();
	Pasta();
	cook("omelette", "Eggs, onions, tomato, salt, peppers");
}
public static void makePancakes() {
	System.out.println("--Pancakes Recipe--");
	System.out.println("Add milk, eggs, sugar");
	mix(120);
	fried(5);
	System.out.println("Enjoy, your Pancakes");
}
public static void cook(String dish, String ingredients) {
	System.out.println("--" +dish.toUpperCase()+" RECIPE--");
	add(ingredients);
	mix(50);
	fried(5);
	System.out.println("--" +dish.toUpperCase()+" is READY, ENJOY IT!!");
	
}
public static void Pasta() {
	System.out.println("--Pasta Recipe--");
	System.out.println("Add water, salt, olive oil");
	boil(2);
	add("Spagetti pasta");
	boil(9);
	mix(60);
	add("Parmesan cheese, marinara");
	System.out.println("Enjoy, your Pasta");
}
public static void add(String ingredient) {
	System.out.println("Add: "+ingredient);
	
}
public static void mix(int seconds) {
	System.out.println("Mix for seconds: "+seconds);
}
public static void fried(int minutes) {
	System.out.println("Fried for minutes: "+minutes);
}
public static void boil(int minutes) {
	System.out.println("Boil for minutes: "+minutes);
}
}