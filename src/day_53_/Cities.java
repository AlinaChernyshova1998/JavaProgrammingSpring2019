package day_53_;

public class Cities {
	public static void main(String[] args) {
		City Baku = new City(123, "Baku");
		System.out.println(Baku.toString());
		City Istanbul = new City(654, "Istanbul");
		City anotherCity = new City(654, "Istanbul");
		System.out.println(Istanbul.toString());
		System.out.println(anotherCity.toString());
		if (Istanbul.equals(anotherCity)) {
			System.out.println("Both are Istanbul");
		} else {
			System.out.println("Does not equal");
		}
		System.out.println(Baku.hashCode());
		System.out.println(Istanbul.hashCode());
		System.out.println(anotherCity.hashCode());
		
		Capital cap= new Capital(123, "Washington DC", 2569874);
		System.out.println(cap.toString());
	}
}
