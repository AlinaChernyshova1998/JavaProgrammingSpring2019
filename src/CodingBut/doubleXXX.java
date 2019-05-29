package CodingBut;

public class doubleXXX {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.println(doubleX("xxbb"));
	}

	public static boolean doubleX(String str) {

		for (int i = 0; i < str.length()-1; i++) {
			if (str.charAt(i)=='x'&& str.charAt(i+1)=='x') {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}
