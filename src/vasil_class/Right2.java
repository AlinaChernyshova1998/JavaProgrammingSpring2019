package vasil_class;

public class Right2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(right2("Hello"));
	}
	public static String right2(String str) {
		  if(str.length()<2){
		    return "";
		  }else {
		    String str1=str.substring(str.length()-2);
		    String str2=str.substring(0,str.length()-2);
		    return str1+str2;
		  }
		}
}
