package vasil_class;

public class ArrayContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 15,5 };
		int[] arr1 = { 55, 68, 12, 15, 85 };

//check if all iteam in arr present in arr1
		for (int n : arr) {
			// System.out.println(n);
			int count = 0;
			for (int n1 : arr1) {
				// System.out.println("Inner: "+n1);
				if (n1 == n) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println("Which numbers in arr matches with arr1: " + n);
			}
//how many iteams are the same in 2 arrays
			// System.out.println("how many items are matches: "+count);
		}
		// or
		for (int n : arr) {
			int count=0;
			//System.out.println(n);
			for (int n1 : arr1) {
				//System.out.println("Inner: "+n1);
				if (n1 == n) {
					System.out.println("Found!!! "+n+" is in Arr1");
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println("Did not find!!! "+n+" is not in Arr1");
			}
		
			}

		

	}
}
