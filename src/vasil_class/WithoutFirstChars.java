package vasil_class;

public class WithoutFirstChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(nonStart("Hello", "There"));
System.out.println(nonStart("java", "code"));
	}
	public static String nonStart(String a, String b) {
		 return a.substring(1)+b.substring(1);
		}
}
