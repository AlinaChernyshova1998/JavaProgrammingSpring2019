package day_33_;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(WarmUp.add1(10, 20));
		System.out.println(Multiply.multiply(10, 20));
	int addResult=WarmUp.add1(15, 25);
	double mResult=Multiply.multiply(10, 5);
	System.out.println(addResult);
	System.out.println(mResult);
	double a=10.0, b=5.50;
	double myResult=Multiply.multiply(a, b);
	System.out.println(myResult);
	double [] dNums= {12.5, 5.25};
	double Result2=Multiply.multiply(dNums[0], dNums[1]);
	System.out.println(Result2);
	if(WarmUp.add1(12,85)==25) {
		System.out.println("Add Unit Test Passed");
	
	}else {
		System.out.println("Add Unit test failed");
	}
	String str="java";
	if(str.length()==4) {
		System.out.println("It is 4 char");
	}else {
		System.out.println("Its not 4 char");
	}
	}
	
}
