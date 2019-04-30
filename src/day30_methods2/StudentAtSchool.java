package day30_methods2;

public class StudentAtSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		study("Java");
		study("Spanish");
		sleep(15);
		
	}
public static void study (String topic) {
	System.out.println("Student is studying "+topic); 
	
}
public static void sleep(int hours) {
	System.out.println("How many hours do you sleep: "+hours+" hours"); 
}
}
