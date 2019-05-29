package day_40_;

public class EmployeeContinue {
	public static void main(String[] args) {
		 Employee alina= new Employee();
		 alina.name="Alina Chernyshova";
		 alina.jobTitle="Software senior engineer";
		 alina.salary=1500000.00;
		 System.out.println("Name: "+alina.name);
		 System.out.println("Job Title: "+alina.jobTitle);
		 System.out.println("Salary: "+alina.salary);
		alina.introduce();
		alina.gottoBreak();
		alina.attendMeetings();
		alina.work();
		
	 }
}
