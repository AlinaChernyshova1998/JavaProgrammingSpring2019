package day_48_;

public class Employee extends Person {
String jobTitle;

@Override
public String toString() {
	return "Employee [jobTitle=" + jobTitle + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
}

public void work() {
	System.out.println(name+" is working as a "+jobTitle);
}


}
