package day_48_;

public class Student extends Person {
int studentID;
String subject;

public void code(String language) {
	System.out.println(name+" is coding "+language);
	
}
public void attendClass() {
	System.out.println(name+" is attending "+subject+" class");
}
}
