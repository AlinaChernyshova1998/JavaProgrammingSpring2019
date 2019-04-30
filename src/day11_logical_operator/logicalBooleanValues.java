package day11_logical_operator;

public class logicalBooleanValues {
public static void main(String[] args) {
	boolean b1=50>10 && 10>100;
	System.out.println("B1: "+b1);
	
	boolean b2='a'=='a' && 123>120;
	System.out.println("B2: " + b2);
	
	boolean b3= true && 10>=10 &&1000<=900;
	
	System.out.println("B3: "+b3);
	
	boolean b4= false && false &&10==10;
	System.out.println("B4: "+b4);

 boolean b5=false && (true || 10==10);
 System.out.println("B5: "+b5);
 
 boolean topicDone= true;
 boolean is3pm=true;
 boolean everythingIsClear=true||false;
 boolean letsGoForABreak=topicDone && is3pm && everythingIsClear;
 System.out.println("lets go for a break: "+letsGoForABreak);
 
 boolean b9=!(true||false)&& true;
 System.out.println("B9: "+b9);
 
 boolean b10=!true||false&& false;
 System.out.println("B10: "+b10);
 
 boolean b11=true;
 System.out.println(!b11);//false
 boolean b12=true;
 System.out.println(!!b12);//true
 
 
 
 
}


}
