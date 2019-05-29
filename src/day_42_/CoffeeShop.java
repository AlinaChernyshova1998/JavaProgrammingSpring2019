package day_42_;
import java.util.*;
public class CoffeeShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//declare an array that can store 2 coffee objects
		//int [] nums = new int[2]
		//String [] str= new String[3]
		//str[0]="java"
		StarbucksCoffee[]coffeeArray= new StarbucksCoffee[2];
		coffeeArray[0]= new StarbucksCoffee();
		coffeeArray[0].SetCoffeeName("Espresso", "tall", 2.55, 50);
		coffeeArray[0].getCoffeeInfo();
		
		StarbucksCoffee latte= new StarbucksCoffee();
		latte.SetCoffeeName("latte", "grande", 4.50, 120);
		coffeeArray[1]=latte;
		//print data from object in index 1
		coffeeArray[1].getCoffeeInfo();
		
	}

}
