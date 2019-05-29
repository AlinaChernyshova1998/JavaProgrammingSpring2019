package CodingBut;

public class DoubleChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(doubleChar("The"));
	}
	public static String doubleChar(String str) {
		  String result="";
		  
		  for(int i=0; i<str.length(); i++){
		 str=str.substring(i,i+1);
		 result+=str;
		   
		  }
		  return result;
		}
}
