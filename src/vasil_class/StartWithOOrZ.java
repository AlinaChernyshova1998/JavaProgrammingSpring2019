package vasil_class;

public class StartWithOOrZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(startOz(""));
	}

	public static String startOz(String str) {
		char first = 'o';
		char second = 'z';
		
		 if (str.startsWith("oz")) {
				return "oz";
			} else if (str.charAt(0) == first) {
				return "o";
			} else if (str.charAt(1) == second) {
				return "z";
			} else {
				return "";
			}
		}
	
}