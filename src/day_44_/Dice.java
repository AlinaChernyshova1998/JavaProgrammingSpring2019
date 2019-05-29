package day_44_;
import java.util.*;
public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job job = new Job();
		System.out.println(job.toString());
		Job job1 = new Job("SDET ", "Amazon", 1500000);
		System.out.println(job1.toString());
		Job job2 = new Job("Java developer");
		System.out.println(job2.toString());

		//create a list of jobs and add 5 different jobs with company, salary and title
		ArrayList<Job> jobs= new ArrayList<>();
		
		jobs.add(job );
		jobs.add(job1 );
		jobs.add(job2);
		jobs.add(new Job("Scrum master", "Google", 1000000));
		jobs.add(new Job("PO", "Netflex", 250000));
		jobs.add(new Job("BA", "Leidos", 150000));
		jobs.add(new Job("Developer", "Linkdn", 360000));
		System.out.println(jobs.toString());
		//find highest paing job and print it
		double maxSalary=0;
		
		int index=-1;
		for(int i=0;i<jobs.size();i++) {
			if(jobs.get(i).getSalary()>maxSalary) {
				maxSalary=jobs.get(i).getSalary();
				index=i;
			}
		}
		System.out.println("Highest salary: "+jobs.get(index));




	}

}
