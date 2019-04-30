package vasil_class;

public class WithOuntFirstAndLastChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(withoutEnd("java"));
	}
	public static String withoutEnd(String str) {
		  if(str.length()>3){
		    return str.substring(1,str.length()-1);
		  }else {
			  return "";
		  }
		}
}
