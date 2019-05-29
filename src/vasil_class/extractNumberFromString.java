package vasil_class;
import java.util.*;
public class extractNumberFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(extractNum("aa2aa3"));
	}
	  public static String extractNum(String s) {
		 String num="";
		for(int i=0; i<s.length(); i++) { 
			if(Character.isDigit(s.charAt(i))) {
		num+=s.charAt(i);
			}
		 }
		return num;
	  }
}
