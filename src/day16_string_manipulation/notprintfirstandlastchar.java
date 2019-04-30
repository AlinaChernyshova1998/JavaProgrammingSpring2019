package day16_string_manipulation;

public class notprintfirstandlastchar {
	public static void main(String[] args) {
		String str="java";
	int word=str.length();
	
	  String first=str.substring(0,1);
	  String last=str.substring(str.length()-1);
 str=str.replace(first,"");
 str=str.replace(last,"");
 System.out.println(str);
}
}