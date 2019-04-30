package day15_string_methods;

public class contains {
public static void main(String[] args) {
	String email="test@gmail.com";
	System.out.println(email.contains("@"));
	String list="potatoes, apples, tomatoes, egg, milk, bread";
	// check if apples is in the shopping list
	if(list.contains("apples")) {
		System.out.println("Apples are there.");
		}else{
			System.out.println("Lets add apples now!");
		}
boolean hasEggs= list.contains("egg");
System.out.println("Contains eggs: "+hasEggs);
boolean hasAvacado=list.toLowerCase().contains("Avacado");
System.out.println("Contains avacado: "+hasAvacado);
 email="name@yahoo.com";
 if(email.contains("yahoo")) {
	 System.out.println("It is yahoo email.");
	 }else if (email.contains("gmail")){
System.out.println("Gmail account.");	 		
}
 String easyTitle="Wooden spoon | Etsy";
 if(easyTitle.contains("|")) {
	 System.out.println("Pipe is there as expected");
	 }else {
		 System.out.println("Pipe is not there");
	 }
 String name="Alina";
 if(name.contains("A")|| name.contains("E")) {
	 System.out.println("Yes, it is contains letters A o E");
	 
	 }else {
		 System.out.println("No, it's not contains.");
 }
}
}