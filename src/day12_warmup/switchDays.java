package day12_warmup;

import java.util.Scanner;

public class switchDays {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number:");
	
	int day;
	day=scan.nextInt();
	switch(day) {
	case 1:
System.out.println("This is Monday!");
break;
case 2:
System.out.println("This is Tuesday!");
break;
case 3:
System.out.println("This is Wednesday!");
break;
case 4:
System.out.println("This is Thursday!");
break;
case 5:
System.out.println("This is Friday!");
break;
case 6:
System.out.println("This is Saturday!");
break;
case 7:
System.out.println("This is Sunday!");
break;
default:
System.out.println("Not a such day!");
										
	}
}
}
