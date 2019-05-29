package day_44_;

public class Job {
private String title;
private String company;
private double salary;

 public Job(String title, String company, double salary)  {
	 System.out.println(" three args constractor");
	setTitle(title);
	 this.company=company;
	 this.salary=salary;
 }
public Job(String title) {
	System.out.println("one args constractor");
	this.title=title;
	this.company="unknown";
}
public Job() {
	System.out.println("no-args constractor");
	this.title="unknown";
	this.company="unknown";
}
public String toString() {
	return "Job [title=" + title + ", company=" + company + ", salary=" + salary + "]";
}
public String getTitle() {
	return title;	
}
public void setTitle(String title) {
	this.title=title;
}
public String getCompany() {
	return company;	
}
public void setCompany(String company) {
	this.company=company;
}
public double getSalary() {
	return salary;	
}
public void setSalary(double salary) {
	this.salary=salary;
}
}
