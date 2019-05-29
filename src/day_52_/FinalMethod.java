package day_52_;

public class FinalMethod {
	public final void method1() {
		System.out.println("Final method 1 ");
	}

	class Sub extends FinalMethod {
		//connot override since it is a final method
		
		//public  void method1() {
			//System.out.println("Final method 1 ");
		//}
			public final void method1(int nums) {
				System.out.println("Final method 1 "+ nums);
			}	
	}
	public static void staticMethod(String word) {
		System.out.println("StaticMethod: "+word);
	}
}
