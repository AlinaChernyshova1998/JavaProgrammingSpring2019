package day_36_;

public class Boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//AUTOBOXING-- primitive>object
		Integer num1=123;
		int n=5;
		Integer num2=n;
		//UNBOXING->object>primitive
		Double d1= new Double(34.2);
		double d2 =d1;
		System.out.println("d1: "+d1);
		System.out.println("d2: "+d2);
		long l1=new Long (6000000);//Unboxing
		Long l2=new Long(35487);
		long l3=l2;//AUTOBOXING
		Long l4=l3;//AUTOBOXING
		
		Integer num3=Integer.valueOf(345);
		
		
		
	}

}
