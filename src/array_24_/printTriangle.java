package array_24_;

import java.util.Scanner;

public class printTriangle {
	public static void main(String[] args) {
		   
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		char star='*';
    for(int i=1; i<=n;i++){
      for(int j=1; j<=i; j++){
        if(star==i){
        System.out.print(j+" ");
       
      }
    System.out.print(star);
  }
System.out.println();
}}}