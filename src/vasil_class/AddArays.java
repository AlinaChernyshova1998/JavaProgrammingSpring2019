package vasil_class;

import java.util.Arrays;

public class AddArays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 10, 20, 5, 3, 6 };
		int[] nums2 = { 5, 1, 1, 4, 10 };

		System.out.println(nums1[0] + nums2[0]);
		String [] str1= {"abc", "hi"};
		String [] str2=	{"bye", "sql"};
		String []newArray1 = add2Arrays(str1, str2);

		System.out.println("nums1:" + Arrays.toString(str1));
		System.out.println("nums2:" + Arrays.toString(str2));
		System.out.println("newArray:" + Arrays.toString(newArray1));
		// declare new empty array with size of nums1
//		int[] nums3 = new int[nums1.length];
//
//		for (int i = 0; i < nums1.length; i++) {
//			nums3[i] = nums1[i] + nums2[i];
//		}

		int[] newArray = add2Arrays(nums1, nums2);

		System.out.println("nums1:" + Arrays.toString(nums1));
		System.out.println("nums2:" + Arrays.toString(nums2));
		System.out.println("newArray:" + Arrays.toString(newArray));
	}

	/*
	 * add2Arrays return type: int[] params: int[] nums1, int[] nums2 add each value
	 * and assign to new array then return it
	 */
	public static int[] add2Arrays(int[] nums1, int[] nums2) {
		// declare new empty array with size of nums1
		int[] nums3 = new int[nums1.length];

		for (int i = 0; i < nums1.length; i++) {
			nums3[i] = nums1[i] + nums2[i]; // 20 + 1
		}

		return nums3;

	}
	public static String[] add2Arrays(String[] str1, String[] str2) {
		String[] str3=new String[str1.length];
		for(int i=0; i<str1.length; i++) {
			str3[i]= str1[i]+"-"+str2[i];
		}
		return str3;
		
	/*["abc", "hi"]
	["bye", "sql"]
	["abc-bye", "hi-sql"]*/
}
}