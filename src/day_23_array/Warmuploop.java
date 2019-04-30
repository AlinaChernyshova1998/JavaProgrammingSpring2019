package day_23_array;
import java.util.Scanner;
public class Warmuploop {
public static void main(String[]args) {
Scanner scan=new Scanner(System.in);	
System.out.println("Enter a number:");
int num=scan.nextInt();//prime number is number if you can "/"by 1 or "/" by themselves (2, 3,5,7,11.13.17.19.23)
for(int i=2; i<num; i++) {
	if(num%i==0) {
	System.out.println(num+" It is not a prime number");
	return;
}
}
System.out.println(num+" It's a prime number");
}}