package day_27_arrayrecap;

import java.util.Scanner;

public class ShorterWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	     
		    String[] str = {scan.next(), scan.next(), scan.next(), 
		                    scan.next(), scan.next(), scan.next()};
		    String min =str[0];
	          int index = 0;
			        
			          for(int i=0; i<str.length; i++){
			            String temp=str[i];
			            if(min.length()>temp.length()){
			            min=str[i];
			            index = i;
			            }
			          }
			           System.out.println(str[index]); 
	}

}
