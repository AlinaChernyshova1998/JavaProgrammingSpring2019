package day_50_;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Duck duck = new Duck();

		animal.speak();
		cat.speak();
		dog.speak();
		duck.speak();
		animal.move(25);
		cat.move(10);
		dog.move(30);
		duck.move(3);
	}

}
