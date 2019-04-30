package day_27_arrayrecap;

import java.util.Arrays;

public class warmup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String url= "https://learn.cybertekschool.com/courses/144";
String[] word=url.split("/");
System.out.println(word[word.length-1]);
System.out.println(Arrays.toString(word));
int num=Integer.parseInt(word[word.length-1]);
if (num==147) {
	System.out.println("Java Programming");
}else if(num==204) {
	System.out.println("Mentoring session");
}else if(num==149) {
	System.out.println("SDLC");
}else if(num==152) {
	System.out.println("QA Testing");
}else if(num==144) {
	System.out.println("Team Activity");
}else if (num==143) {
	System.out.println("Welcome Kit");
}else {
	System.out.println("Invalid number!");
}
/*147 -> Java programming
204 -> Mentoring sessions
149 -> SDLC
152 -> QA Testing
144 -> Team activity
143 -> Welcome Kit*/


	}

}
