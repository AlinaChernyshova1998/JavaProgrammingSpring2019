package vasil_class;

public class merge {
	 public static void main(String[]args){
		    System.out.println(mergeStrings("1234","abcdec"));
		  }
		  
		  public static String mergeStrings(String one, String two) {
		    String together="";
		    if(one.length()==two.length()){
		    for(int i=0; i<one.length(); i++){
		    	 together+=one.charAt(i)+""+two.charAt(i);
		    }
		    return together;
		    } else if(one.length()>two.length()){
		      for(int j=0; j<two.length(); j++){
		    	  together+=one.charAt(j)+""+two.charAt(j); 
		      }
		      together+=one.substring(two.length());
		      return together;
		    
		    } else if (two.length()>one.length()){
		    	for(int a=0;a<one.length();a++){
		            together+=one.charAt(a)+""+two.charAt(a);
		    	}
		            together+=two.substring(one.length());
		            return together;
		    

		        
		    }
		    return together;
		  }
		
}
