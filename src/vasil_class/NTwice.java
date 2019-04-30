package vasil_class;

public class NTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(nTwice("Hello", 2));
	}
	public static String nTwice(String str, int n) {
		  String sentence="";
		  for(int i=0; i<str.length();  i=i+n){
		    sentence=str.substring(0,str.charAt(i));//+str.substring(str.length()-i);
		  }
		  return sentence;
		}
}
