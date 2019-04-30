package vasil_class;

public class PrintOddOrEvenChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(everyNth("alina",2));
	}
	public static String everyNth(String str, int n) {
		  String sentence ="";
		   for(int i=0; i<str.length(); i=i+n){
		    sentence=sentence+str.charAt(i);
		   }
		      return sentence; 
		    
		    
		  
		  
		  
		}

}
