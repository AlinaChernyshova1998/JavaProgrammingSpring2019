package day_48_;

public class Company {
public static void main(String[] args) {
	Employee employee1= new Employee();
	employee1.name="Marufjon";
	employee1.jobTitle="teacher";
	employee1.gender='M';
	employee1.age=50;
	
	Employee employee2= new Employee();
	employee2.name="KIKI";
	employee2.jobTitle="HR";
	employee2.gender='F';
	employee2.age=30;
	
	employee1.work();
	employee2.work();
	
	employee1.eat("rice");
	employee2.eat("sushi");
	
	employee1.walk();
	employee2.walk();
	
	
	employee1.sleep(6);
	employee2.sleep(3);
	
	System.out.println(employee1.toString());
	System.out.println(employee2.toString());
}
}
