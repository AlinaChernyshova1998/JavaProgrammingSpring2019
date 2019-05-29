package day_40_;

public class Employee {
String name;
String jobTitle;
double salary;
 public void work() {
	 System.out.println("Hello, "+name+", your work schedule is 8am-4pm" );
 }
 public void gottoBreak() {
	 System.out.println("Dear "+name+", we have break time at 12pm, please come back on time");
 }
 public void attendMeetings() {
	 System.out.println("We will share our meeting schedule ");
 }
 public void introduce() {
	 System.out.println("Name["+ name +"], jobTitle[" + jobTitle 
				+"], salary[" + salary + "]");
 }
}
