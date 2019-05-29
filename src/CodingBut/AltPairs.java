package CodingBut;

public class AltPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(altPairs("Chocolate"));
	}
	public static  String altPairs(String str) {
		  String sentence="";
		  for(int i=0; i<str.length(); i+=4){
		    int end= i+2;
		    if(end>str.length()){
		      end=str.length();
		    }
		    sentence= sentence+str.substring(i, end);
		  }
		  return sentence;
		}
}