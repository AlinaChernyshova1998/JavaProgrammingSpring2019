package day_40_;

public class Contact {
String name;
int phoneNumber;
String email;
public void call() {
	 System.out.println("Calling ......"+name);
}
public void sendMessage() {
	System.out.println("Hello, Dear "+name+",nice to meet you! "+" Your phone number is: "+phoneNumber+", is it right?"+" and your email is correct, am i right? "+email);
}

}
