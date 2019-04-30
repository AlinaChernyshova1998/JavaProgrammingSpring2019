package vasil_class;

public class firstHalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println( firstHalf("WooHoo"));
	}
	public static  String firstHalf(String str) {
		  if(str.length()%2==0){
			  String sentence=str.substring(0,str.length()/2);
		    return sentence;
		  }
		return str;
		}
}
