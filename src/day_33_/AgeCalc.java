package day_33_;

public class AgeCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=calculateAge(1997);
		System.out.println("Your age is "+age);
	}
public static int calculateAge(int year) {
	 int curryear=2019;
	int age=curryear-year;
	//System.out.println("Your age is "+age);
	if(age>=1&& age<=14) {
		System.out.println("child");
			
		}else if(age>=15 && age<=25) {
		System.out.println("youngster");
		}else if(age>=26 && age<=64) {
			System.out.println("adult");
		}else if(age>=65) {
			System.out.println("senior");
		}else {
			System.out.println("invalid age");
return 0;
		}
	
	return age;
	
}
}
