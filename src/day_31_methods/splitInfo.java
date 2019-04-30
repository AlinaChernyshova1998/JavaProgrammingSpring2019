package day_31_methods;

import java.util.Arrays;
import java.util.Scanner;

public class splitInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner inp = new Scanner(System.in);
	    String s = inp.next();
	    person(s) ;
	  }
	  
	   public static void person(String info){
		
			//your code here
			String [] info1=info.split(",");
			System.out.println("Words in this sentence: "+Arrays.toString(info1));
			System.out.println(info1.length);//3
			System.out.println("Person name: "+info1[0]+" last name: "+info1[1]+" age: "+info1[2]);
			
	}

}
