package array_24_;

public class CitiesArray {
	public static void main(String[] args) {
		String[] cities = { "Moscow", "Kiev", "Arlington", "Baku", "Tbilisi", "Minsk" };
		System.out.println(cities.length);
		// print all cities that start with M
		for (int i = 0; i < cities.length; i++) {
			if (cities[i].startsWith("M")) {
				System.out.println(cities[i]);
			}

		}
		System.out.println("&&&&&&");
		for (String city : cities) {
			if (city.startsWith("M")) {
				System.out.println(city);
			}

		}

	}
}