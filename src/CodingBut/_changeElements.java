package CodingBut;
import java.util.*;
public class _changeElements {
	public static void main(String [] args){
		String a_b;
	    System.out.println(Arrays.toString(do_switch(new int [] {1,2,3,4})));
	  }
	public static int[] do_switch(int[] i) {
	  int first=i[0];
		i[0]=i[i.length-1];
	i[i.length-1]=first;
	//System.out.println(Arrays.toString(num));
	return i ;

		}
	}

