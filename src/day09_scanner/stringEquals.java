package day09_scanner;

public class stringEquals {
public static void main(String[] args) {
String str1="java";
String str2="java";
//using==
System.out.println(str1==str2);//true
System.out.println(str1=="java");//true
System.out.println(str1=="Java");//false

//equals
System.out.println(str1.equals(str2));//true
System.out.println(str1.equals("java"));//true
System.out.println(str2.equals("Java"));//false


//String month="March";
String month=new String("March");
String month2= new String("March");
System.out.println(month==month2);//false
System.out.println(month.equals(month2));//true
System.out.println(month.equals("March"));//true
}
}