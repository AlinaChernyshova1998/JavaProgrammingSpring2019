package day16_string_manipulation;

public class replacethem {
public static void main(String[]args) {
	String sentence="Coding is fun, it is my hobby";
	String withNoSpaces=(sentence.replace(" ", ""));
	System.out.println(withNoSpaces);
	//replace, with !!!
	String Coma=(sentence.replace(",", "!!!"));
	System.out.println(Coma);
	String mixed= "&^@#j$a-v|a@#$";
	//clean up mixed
	mixed=mixed.replace("&^@#", "");
	System.out.println(mixed);
	mixed=mixed.replace("$-|", "");
	System.out.println(mixed);
	mixed=mixed.replace("$", "");
	mixed=mixed.replace("-", "");
	mixed=mixed.replace("|", "");
	System.out.println(mixed);
	mixed=mixed.replace("@", "");
	mixed=mixed.replace("#", "");
	System.out.println(mixed);
	
	
	String result="About 115,000,000 result(0.59 second)";
	//using replace get number of result
	result=result.replace("About", "");
	System.out.println(result);
	result=result.replace("result", "");
	System.out.println(result);
	result=result.replace("(0.59 second)", "");
	System.out.println(result);
	result=result.replace(" ", "");
	System.out.println(result);
			
			
	
}
}
