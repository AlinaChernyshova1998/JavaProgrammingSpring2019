package day_42_;

public class Person {
	private String name;
	private int age;

//getter and setter methods for name
//read only
	public String getName() {

		return name;

	}

//write only void
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {

		return age;
	}

//write only void
	public void setAge(int age) {
		this.age = age;
	}

}
