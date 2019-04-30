package day16_string_manipulation;

public class firsthalf {
public static void main(String[] args) {
	String str="Hello";
	int word= str.length()/2;
	  String str1= str.substring(0,word);
	 System.out.println(str1);
	 //last middle
	 int word2=str.length()/2;
	 String str2=str.substring(word2);
	 System.out.println(str2+str1);
	}
}

