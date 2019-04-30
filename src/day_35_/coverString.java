package day_35_;

public class coverString {
	 public static void main(String[] args) {
		    System.out.println(coverString("java methods", "me") ) ; //java [me]thods
		  }
		  
		  public static String coverString(String main, String coverME) {
			  String sentence="";
		  if(main.contains(coverME)){ 
			  sentence="["+coverME+"]";
		   main=main.replace(coverME, sentence);
		  }else{
		    System.out.println("["+main+"]");
		  }
		return main;
		    
		  }
		  
		}

