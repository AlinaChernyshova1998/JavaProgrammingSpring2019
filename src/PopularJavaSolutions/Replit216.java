package PopularJavaSolutions;
import java.util.*;
public class Replit216 {
	 public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n) 
	  {
	
	
	   for(int i=0; i<r.size(); i++){
	       r.remove(n);	    
		  }    
	   
	return r;
	   
	  }
	  
	  public static void main(String[] args)
	  {
	  
	    ArrayList<Integer>  arr = new ArrayList<>();
	    Integer[] nums = new Integer[]{1,2,1,1,1};
	    arr.addAll(Arrays.asList(nums));
	    
	    System.out.print(removeInst(arr,1));
	   
	    
	  }//end main
	
}
