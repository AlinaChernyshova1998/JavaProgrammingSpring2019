package day14_string_methods;

public class StringSize {
public static void main(String[] args) {
	String str1="Good morning";
	if(str1.equals("Good morning")) {
		System.out.println("Match");
	}else{
		System.out.println("Not match");
	}
	if(str1.equalsIgnoreCase("good morning")) {
		System.out.println("Match-ignore case");
	}else{
		System.out.println("Not Match-ignore case");
	}
	//convert to ALL uppercase 
	System.out.println(str1.toUpperCase());
	System.out.println(str1);
	str1=str1.toUpperCase();
	System.out.println("After assignments: "+ str1);
	
	//combine the above methods together:
	//covert to all lowercase first the check if it equals("good morning")
	if (str1.toLowerCase().equals("good morning")) {
	
	System.out.println("Chained methods: match");
}else{
	System.out.println("Not match");
}
	String myName="Murodil";
	System.out.println(myName.length());


int length=myName.length();
System.out.println("My name is length: "+length);
//usernames may be exactly 8 characters
String username="Alinache";

if (username.length()==8) {
	System.out.println("valid username");
}else{
	System.out.println("not valid username");
}
	String password="woodenSpoons";
	if(password.length()>=6) {
		System.out.println("valid password");
	}else{
		System.out.println("not valid password");
	}
	int passwordLength=password.length();
	if(passwordLength<6) {
		System.out.println("not valid password, too short");
	}else{
		System.out.println("valid password, good job");
		
	}
	
}

}
