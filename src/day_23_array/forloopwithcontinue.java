package day_23_array;

import java.util.Scanner;

public class forloopwithcontinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);

for(int i=1;i<=50;i++) {
if((i%5==0) && (i%20!=0)) {
	continue;	
}
if(i%20==0) {
	break;
}
System.out.print(i+",");
	}

}
}