package vasil_class;

public class Left2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(left2("hello"));
	}
	public static String left2(String str) {
		  if(str.length()<=2){
		    return str;
		  }else{
		    String str1=str.substring(0,2);
		  String str2=str.substring(2);
		    return str=str2+str1;
		  }
		}
}
