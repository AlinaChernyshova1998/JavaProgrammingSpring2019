package day07_scanner;

public class PreAndPost {
public static void main(String[] args) {
	int num=10;
	int num2=num++;
	System.out.println("num: "+ num);
	System.out.println("num2: "+ num2);
	
	int n=10;
	int n2=++n;
	System.out.println("n: "+ n);
	System.out.println("n2: "+n2);
	  
	
	int i=10;
	i++; //add 1
	++i; //add 1
	System.out.println("I value:"+i);
	 
	int bananas=6;
	int pears= ++bananas;
	int apples=bananas++;
	System.out.println(bananas);
	System.out.println(pears);
	System.out.println(apples);
	
	
	int friends=10;
	System.out.println(friends++);
	System.out.println(friends);
	System.out.println(++friends);
	
	int p1=10;
	int sum=p1++ + 5;
	System.out.println(sum);
	System.out.println(p1);
	
	
	int batteries=8;
	int oldBatteries=5;
	int totalBatteries= batteries++ + ++oldBatteries;
	System.out.println("batteries: "+ batteries);//9
	System.out.println("oldBaterries: "+ oldBatteries);//6
	System.out.println("totalBatteries: "+ totalBatteries);//14
	
	
}
}
