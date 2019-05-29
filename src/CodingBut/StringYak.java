package CodingBut;

public class StringYak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println( stringYak("yakpak"));
	}
	public  static  String stringYak(String str) {
		 String sentence="";
		  if(str.contains("yak")){
		 sentence=str.replace("yak", "");
		    
		  }
		  return sentence;
		}

}
