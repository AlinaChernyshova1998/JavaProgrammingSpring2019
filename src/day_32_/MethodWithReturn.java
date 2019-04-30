package day_32_;

public class MethodWithReturn {
	public static void main(String[] args) {
		String[] arr = { "a", "foo", "bar", "foo", "bla" };
		String t = "foo";
		System.out.println(count_appearance(arr, t));
	}

	public static int count_appearance(String[] arr, String t) {
int count=0;
		for (String arr1 : arr) {
				if (t.equals(arr1)) {
					count++;
					
					
				}
			}
		return count ;
		
		
		
	

	} // end count_appearance

}
