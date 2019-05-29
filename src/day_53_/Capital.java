package day_53_;

public class Capital extends City {
	private long population;
	public int count=120;
	
	public static void buildARoad() {
		System.out.println("Capital city - building a road");
	}
	
	public void showCount() {
		System.out.println("City count: "+super.count);
		System.out.println("Capital count: "+count);
	}
	
public Capital(int id, String name, long population) {
	super(id, name);
	this.population=population;
}
@Override
public String toString() {
	return super.toString()+" population: "+population+" count: "+count;
}
public long getPopulation() {
	return population;
}

public void setPopulation(long population) {
	this.population = population;
}

}
