package day10_IfElse.java;

public class ifStatementWithBooleanVariables {
public static void main(String[] args) {
	boolean breakTime=true;
	if(breakTime==true) {
		System.out.println("Is it Break Time? Break until 8.35pm");
	}else{
		System.out.println("Not Break Time yet");
		
	}
	//second version
	if(breakTime) {
		System.out.println("Is it Break Time? Break until 8.35pm");
	}else{
		System.out.println("Not Break Time yet");
}
//third version
	boolean classTime=true;
	if(classTime) {
		System.out.println("Come back on time");
		System.out.println("Stop talking");
		System.out.println("Pay Attention");
	}else {
		System.out.println("Take a walk and drink some water");
		
	}
	//fourth version
	boolean qualified=false;
	if(qualified==false) {
		System.out.println("Your application was not approved!");
	}else{
		System.out.println("Your application was approved!");
	}
}
}