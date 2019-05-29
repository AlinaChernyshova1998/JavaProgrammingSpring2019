package day_43_;

public class MyPet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pet pet1= new Pet("Dog", "Tushi");
Pet pet2= new Pet("Cat", "Barsik");
Pet pet3= new Pet("Cat", "Mila");
Pet pet4= new Pet("Fish", "Nemo");
Pet pet5= new Pet("Goat", "Kozlic");
Pet pet6= new Pet("Bird", "Kesha");
pet1.speak();
pet2.speak();
pet3.speak();
pet4.speak();
pet5.speak();
pet6.speak();
System.out.println(pet1.toString());
System.out.println(pet2.toString());
System.out.println(pet3.toString());
System.out.println(pet4.toString());
System.out.println(pet5.toString());
System.out.println(pet6.toString());
	}

}
