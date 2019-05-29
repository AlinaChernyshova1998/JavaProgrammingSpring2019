package day_48_;

public class School {
	public static void main(String[] args) {
		Person person1 = new Person();
		Student student1 = new Student();
		person1.name = "Alina";
		person1.age = 25;
		person1.gender = 'F';
	
		
		student1.name = "Roman";
		student1.age = 28;
		student1.gender = 'M';
		
		
		person1.eat("pizza");
		student1.eat("grechka");
		person1.walk();
		student1.walk();
		person1.sleep(8);
		student1.sleep(6);
		
		Student student2= new Student();
		student2.name="Blad";
		student2.age=19;
		student2.gender='M';
		student2.studentID=152365;
		student2.subject="agile scrum";
		
		student2.attendClass();
		student2.code("java");
		student2.eat("kebab");
		student2.walk();
		student2.sleep(10);
		
		
		
	}
}
