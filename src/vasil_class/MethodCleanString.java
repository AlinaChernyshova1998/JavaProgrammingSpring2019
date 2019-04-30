package vasil_class;

public class MethodCleanString {
	 public static void maint(String[] args){
		    System.out.println(clean("one two three","two"));
		  }
		  public static String clean (String text ,String badWord) {
		    String sentence="";
		if(text.contains(badWord)){
		sentence=text.replace(badWord,"");
		}
		return sentence;
		  }
		}