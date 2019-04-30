package vasil_class;

public class methodstoUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(endUp("Hello"));
	}
	public static String endUp(String str) {
		if(str.length()<3){
			String str1=str.toUpperCase();
			   return str1;
			 }
	
		 String str2=str.substring(0,str.length()-3)+str.substring(str.length()-3).toUpperCase();
		 
		 return str2;
		
		}
}
