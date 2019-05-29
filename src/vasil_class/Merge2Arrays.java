package vasil_class;

import java.util.Arrays;

public class Merge2Arrays {

	public static int[] mergR(int[] a,int[] b) {
	    int [] c= new int [a.length+b.length];
	  
	    for(int i=0; i<a.length; i++){
	     c[i]=a[i];
	     for(int j=0; j<b.length; j++){
	       c[j+a.length]= b[j];
	       
	     }
	      
	    }
	    
	   
	    return c;
	  }//end mergR
	  
	  public static void main(String[] args) {
	  System.out.println(Arrays.toString(mergR(new int []{1,2,3}, new int []{4,5,6})));
	  }
	
	

}
