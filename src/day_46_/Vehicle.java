package day_46_;

import vasil_class.returnOperator;

public class Vehicle {
String type;
static int numberOfVehicles=56;
public static void vehicleInfo() {
	System.out.println(numberOfVehicles);
	int count=getNumber();
	String make="Kia";
	make=make.toUpperCase();
	Vehicle vh= new Vehicle();
	
}
public static int getNumber() {
	return numberOfVehicles;
}
public String toString() {
	return "Vehicle type:"+type+" | numberOfVehicles "+numberOfVehicles;
}
}
