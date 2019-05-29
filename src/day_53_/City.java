package day_53_;

public class City {
private int id;
private String name;
public int count=100;

public static void buildARoad() {
	System.out.println("City - building a road");
}
public void letsBuildARoad() {
	buildARoad();
}
public City(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override 
	public int hashCode() {

		return id+name.length();
	}
@Override
public String toString() {
	
	return "id: "+id+" name: "+name+" count: "+count;
	
}
@Override
public boolean equals(Object obj) {
	City otherCity= (City)obj;
	if(this.id==otherCity.id && this.name.equals(otherCity.name)) {
	return true;
	}
	return false;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
