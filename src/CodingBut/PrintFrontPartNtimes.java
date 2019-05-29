package CodingBut;

public class PrintFrontPartNtimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(frontTimes("Ab", 3));
	}

	public static String frontTimes(String str, int n) {
		String str1 = "";
			for (int i = 0; i < n; i++) {
				if (str.length() >= 3) {
					str1 += str.substring(0, 3);
				} else {
					str1+= str;
				}
			}
		
		return str1;
	}
}
