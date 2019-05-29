package day_36_;

public class WrapperClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Byte.MIN_VALUE);
System.out.println(Byte.MAX_VALUE);

System.out.println(Short.MIN_VALUE);
System.out.println(Short.MAX_VALUE);

System.out.println(Integer.MIN_VALUE);
System.out.println(Integer.MAX_VALUE);

System.out.println(Long.MIN_VALUE);
System.out.println(Long.MAX_VALUE);

System.out.println(Float.MIN_VALUE);
System.out.println(Float.MAX_VALUE);

System.out.println(Double.MIN_VALUE);
System.out.println(Double.MAX_VALUE);

System.out.println(Character.MIN_VALUE);
System.out.println(Character.MAX_VALUE);

int count=Integer.parseInt("354689");
System.out.println("count "+count);
int count2=Integer.valueOf("5698");
System.out.println("count2 "+count2);

System.out.println(Character.isAlphabetic('a'));
System.out.println(Character.isAlphabetic('1'));
System.out.println(Character.isAlphabetic('@'));
System.out.println(Character.isLetter('a'));
System.out.println(Character.isDigit('5'));
System.out.println(Character.isDigit('p'));
String str="java101";
System.out.println(Character.isAlphabetic(str.charAt(0)));
System.out.println(Character.isDigit(str.charAt(6)));
String str1="ja2354va101";
for (int i=0; i<str.length(); i++) {
	if(Character.isDigit( str1.charAt(i) )) {
		System.out.print(str1.charAt(i));
	
}

}
	}
}
