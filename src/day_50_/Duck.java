package day_50_;

public class Duck extends Animal {
	public void speak() {
		System.out.println("Duck is saying quwak quwak");
	}

	public void move(int steps) {
		System.out.println("Duck is moving " + steps + " steps");
	}
}
