package day_49_;

public class Animal {
	private String type;

	public Animal() {
		System.out.println("Animal constractor");
		type = "undefined";

	}
	public Animal(String type) {
		System.out.println("Animal 1-args constractor");
		this.type=type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
