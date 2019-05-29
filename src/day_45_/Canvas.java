package day_45_;

import java.util.ArrayList;

public class Canvas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Course course1= new Course();

course1.setName("Java Programming");
ArrayList<String> teachers= new ArrayList<>();
teachers.add("Elena");
teachers.add("Maria");
teachers.add("Murodil");
course1.setTeachers(teachers);
System.out.println(course1.toString());
ArrayList<String> students= new ArrayList<>();
students.add("Alina");
students.add("Anna");
course1.setStudents(students);
System.out.println(course1.toString());
 course1.addTeacher("Gaziza");
 course1.addStudent("Samir");
 if(course1.getTeachers().contains("Gaziza")) {
	 System.out.println("Gaziza is a teacher");
 }else {
	 System.out.println("Gaziza is not a teacher");
 }
 if(course1.getStudents().contains("Samir")) {
	 System.out.println("Samir is a student");
 }else {
	 System.out.println("Samir is not a student");
 }
 course1.removeTeacher("Murodil");
 course1.removeStudent("Samir");
if(!course1.getStudents().contains("Samir")) {
	System.out.println("Samir is removed");
}else {
	System.out.println("Samir is still here");
}
	}

}
