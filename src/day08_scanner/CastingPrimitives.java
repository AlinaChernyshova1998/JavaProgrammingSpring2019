package day08_scanner;

public class CastingPrimitives {
public static void main(String[] args) {
	// cast double value to int
	int i= (int) 3.4;
	System.out.println(i);
	//======================
	double price= 230.50;
	int dollars= (int) price;
	System.out.println(dollars);
	//============================
	// whole numbers. byte, short, int
	int count=44;
	byte byteCount=(byte)count;
	System.out.println(byteCount);
	//==============================
	long LongValue=32545L;
	int intValue= (int) LongValue;
	System.out.println(intValue);
	
	//============================
	int large=5678;
	short small= (short) large;
	System.out.println(small);
	//=============================
	 int result=(int)(500.4/2.0);
	 System.out.println(result);
	 //============================
	 
	
}
}
