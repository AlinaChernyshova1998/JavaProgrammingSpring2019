package day_46_;

public class Campus {
private String city;

static {
	System.out.println("static block");
}
public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}
public static void campusInfo() {
	System.out.println("Welcome");
}


public Campus(String city) {
	System.out.println("Constractor");
	this.city=city;
	
}

}
