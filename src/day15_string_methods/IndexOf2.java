package day15_string_methods;

public class IndexOf2 {
public static void main(String[] args) {
	String list="html-selenium-angular-jenkins-grid";
	int firstDash=list.indexOf("-");
	System.out.println("First dash:"+firstDash);
	int secondDash=list.indexOf("-", 5);
	System.out.println("Second dash:"+secondDash);
	int thirdDash=list.indexOf("-", 14);// or int thirdDash=list.indexOf("-", secondDash+1);
	System.out.println("Third dash:"+thirdDash);
	//find a last dash
	int lastDash=list.lastIndexOf("-");
	System.out.println("Last dash:"+lastDash);
}
}
