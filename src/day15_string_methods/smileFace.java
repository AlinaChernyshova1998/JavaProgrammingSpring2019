package day15_string_methods;



public class smileFace {
public static void main(String [] args) {
	
	
	String emoji=":)";
	if(emoji.length()!=2) {
		System.out.println("Invalid emoji!");
return;
	}
//
char first = emoji.charAt(0);
char second =emoji.charAt(1);

 if (first==':') {
   if(second==')') {
System.out.println("It is smile!");
   }else if(second=='(') {
System.out.println("It is sad!");
   }else if(second=='/') {
System.out.println("It is upset!");
   }else if(second=='p') {
System.out.println("It is playful!");
	}else {
		System.out.println("Unknown emoji");
	}
}else if (first==';') {
	if(second==')') {
		System.out.println("It is wink!");
}else if (first=='(') {
	if(second=='(') {
		System.out.println("It is smile!");
}else if (first==')') {
	
}else {
	System.out.println("invalid character!");
}
	
	
	

	}
}}}

	


