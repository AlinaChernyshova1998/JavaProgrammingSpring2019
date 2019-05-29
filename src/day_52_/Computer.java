package day_52_;

public class Computer {
private String color;
private String brand;


public boolean equals(Object other) {
	Computer that = (Computer) other;
	if(this.brand.equals(that.brand) &&
	   this.color.equals(that.color)) {
		return true;
	}	
	return false;	
}
public Computer() {
	super();
}
public Computer(String color, String brand) {
	super();
	this.color = color;
	this.brand = brand;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}


}
