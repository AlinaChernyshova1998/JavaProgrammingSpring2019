package vasil_class;

public class PrintMiddle2Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(middleTwo("jvaa"));
	}
	public static String middleTwo(String str) {
		  if(str.length()<2){
		    return "";
		    
		  }else {
		    str=str.charAt(str.length()/2-1)+""+(str.charAt(str.length()/2));
		  }
		  return str;
		}
}
