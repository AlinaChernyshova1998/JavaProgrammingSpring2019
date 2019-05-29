package day30_methods2;

public class Polindrome {
	 public static void main(String[] args){
		    System.out.println(isPalindrome("Race car"));
		  }
		  public static boolean isPalindrome(String check) {
		   String polindrom="";
		   int check1=check.length()-1;
		while(check1>=0) {
				polindrom=polindrom+check.charAt(check1);
				check1--;
			}	
				if (polindrom.equalsIgnoreCase(check)) {
				return true;
				}
				return false;
			
		}
		
}
