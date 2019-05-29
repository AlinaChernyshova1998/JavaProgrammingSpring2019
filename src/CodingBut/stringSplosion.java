package CodingBut;

public class stringSplosion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(stringSplosion("Code"));
System.out.println(stringSplosion("abc"));
System.out.println(stringSplosion("ab"));
	}
	public static  String stringSplosion(String str) {
		  String result="";
		  for(int i=0; i<str.length(); i++){
		    result= result+str.substring(0,i+1);
		  }
		  return result;
		}

}
