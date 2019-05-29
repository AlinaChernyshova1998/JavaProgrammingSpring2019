package day_53_;

public class TestHiding {
	public static void main(String[] args) {
		City city = new City(236, "Kiev");
		Capital capital = new Capital(6547, "Donetsk", 856984);
		System.out.println(city.count);
		System.out.println(capital.count);
		System.out.println(city.toString());
		System.out.println(capital.toString());
		capital.showCount();
		//call static methods 
		city.buildARoad();
		capital.buildARoad();
		City.buildARoad();
		Capital.buildARoad();
		//------------------------------------
		City city2= new City(256, "Arlington");
		Capital capital2 = new Capital(5698, "Richmond", 569874);
		city2.letsBuildARoad();
		capital2.letsBuildARoad();
	}
}
