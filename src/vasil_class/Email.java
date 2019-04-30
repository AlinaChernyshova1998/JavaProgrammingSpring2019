package vasil_class;

public class Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email=generateEmail("jAmes" , "khaJib");
System.out.println(email);
String email1=generateEmail("alina", "ChER", "@mail.ru");
System.out.println(email1);
System.out.println(formatName(""));
String [] characters= {"Savannah Daniel", "Abby Hobi", "Velme Hamilgton"};
for(String ch:characters) {
	String firstname=ch.split(" ")[0];
	String lastname=ch.split(" ")[1];
	System.out.println(generateEmail(firstname, lastname));
	
}

	}
public static String generateEmail(String firstname, String lastname) {
	return firstname.toLowerCase()+"_"+lastname.toLowerCase()+"@gmail.com";
	
}
public static String generateEmail(String firstname, String lastname, String domain) {
	return firstname.toLowerCase()+"_"+lastname.toLowerCase()+domain;
}
public static String formatName(String str) {
	//it will capitalize first char and all other char will be lowerCase
	if(str.isEmpty()) {
		return "Name is too short";
	}else if(str.contains(" ")) {
		String [] values=str.split("");
		String result="";
		for(String value:values) {
			result=result+value.substring(0,1).toUpperCase()+value.substring(1).toLowerCase()+"";
			
		}
		return result.trim();
	}
	return str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
	
}
}