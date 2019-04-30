package day_28_multid_arrays;

import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FastFood {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// read all data and assign to string array
		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
		System.out.println("Data size: " + data.length);
//print first row
		System.out.println(data[0]);
// print last restaurant
		System.out.println(data[data.length - 1]);
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			count++;
			System.out.println("#" + count + data[i]);

		}
//print all restaurant info in state va
		System.out.println("&&&&&&&&&&&&&&&&");
		int countVA = 1;
		for (int i = 1; i < data.length; i++)
			if (data[i].contains(",VA,")) {
				System.out.println(countVA + ":" + data[i]);
				countVA++;
			}
//find all restaurant info in state va
//print the restaurant names along with city name
//Subway-Herdon
		for (String restaurant : data) {
			if (restaurant.contains(",VA,")) {
				String[] resVA = restaurant.split(",");
				System.out.println(resVA[2] + "/" + resVA[1]);
			}
		}
	}
}
