package vasil_class;
import java.util.*;
public class merge1 {

	 public static void main(String [] args){
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

