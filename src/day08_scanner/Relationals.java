package day08_scanner;

public class Relationals {
public static void main(String[] args) {
	double d1=23.56;
	double d2=20.43;
	System.out.println(d1>=d2);
	boolean check = d1>=d2;
	System.out.println(check);
	
	char ch1='a';
	char ch2='j';
	char ch3='A';
	System.out.println(ch2>ch1);
	
	System.out.println(ch2>ch1);//j>a
	System.out.println(ch2>ch3);// j>A
	System.out.println(ch1>ch3);//a>A

	boolean b=true ==false;
	System.out.println(b);//false
	
	b=true!=false;
	System.out.println(b);//true
	
	
}
}
