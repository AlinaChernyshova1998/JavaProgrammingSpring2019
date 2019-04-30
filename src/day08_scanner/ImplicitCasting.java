package day08_scanner;

public class ImplicitCasting {
public static void main(String[] args) {
	//automatically casting from smaller to larger type
	short shortValue=3255;
	int intValue=(int)shortValue;
	System.out.println(intValue);
	//automatically casting from larger to smaller type
	long longValue=10152l;
	byte byteValue= (byte)longValue;
	System.out.println(longValue);
	//=======================
	double price=345;
	System.out.println(price);
	//=========================
	int price1=32456;
	double dPrice= price1;
	System.out.println(dPrice);
	
	
}
}
