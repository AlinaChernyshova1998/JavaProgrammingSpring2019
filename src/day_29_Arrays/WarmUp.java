package day_29_Arrays;

import java.util.Arrays;

public class WarmUp {

	public static void main(String[] args) {
		String[][] countries = { { "USA", "Washington DC" }, { "Canada", "Ottawa" }, { "Mexico", "Mexico city" },
				{ "Brasil", "Brasilia" }, { "Peru", "Lima" }, { "Argentina", "Boanes Aeros" }, { "Bolivia", "La Paz" },
				{ "Macedonia", "Scopia" }, { "Kazakhstan", "Nursultan" } };
//   0           1
		/*
		 * 0 USA Washington DC 1 Canada Ottawa 2 Mexico Mexico city 3 Brasil Brasilia 4
		 * Peru Lima 5 Argentina Boanes Aeros 6 Bolivia La Paz 7 Macedonia Scopia 8
		 * Kazakhstan Nursultan
		 */
//String [][]countries=[9][2];
//countries[0][0]="USA";
//countries[0][1]="Washington DC";
//countries[1][0]="Canada";
//countries[1][1]="Ottawa";
//print countries and there capitals
		System.out.println(countries[0][0] + "|" + countries[0][1]);
		System.out.println(countries[8][0] + "|" + countries[8][1]);
//print all countries
		System.out.println(Arrays.deepToString(countries));
		for (int i = 0; i < countries.length; i++) {
			System.out.print(countries[i][0] + "|");
		}

		System.out.println();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		for (String[] country : countries) {
			System.out.print(country[0] + "|");
		}
		System.out.println();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		for (String[] country : countries) {
			System.out.print(country[1] + "|");
		}
		System.out.println();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		for (int i = 0; i < countries.length; i++) {
			System.out.print(countries[i][1] + "|");
		}
		System.out.println();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
//get all the cities and add to the cities Array
		String[] cities = new String[countries.length]; // or String [] cities= new String [9];
		for (int i = 0; i < countries.length; i++) {
			cities[i] = countries[i][1];
		}
		System.out.print(Arrays.toString(cities));

//look for Bolivia int countries Array and test if capital city is La paz

		System.out.println();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		for (int j = 0; j < countries.length; j++) {
			if (countries[j][0].equals("Bolivia")) {
				// System.out.print(countries[j][0+1]);
				if (countries[j][1].equals("La Paz")) {
					System.out.println("Bolivia test passed");
				} else {
					System.out.println("Bolivia test failed");
				}
				break;
			}

		}
	}
}