package day16_string_manipulation;

public class CapitalCity {
public static void main(String[] args) {
	String str="Moscow is a capital Russia";
	
	str=str.replace("Moscow", "Baku");
	System.out.println(str);
	str=str.replace("Russia", "Azerbaijan");
	System.out.println(str);
	String email="firstName_LastName@gmail.com";
	String company="deloitte";
	String newEmail=email.replace("firstName_LastName", company);
	System.out.println(newEmail);
}
}
