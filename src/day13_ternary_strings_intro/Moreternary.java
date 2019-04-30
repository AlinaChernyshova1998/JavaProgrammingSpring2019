package day13_ternary_strings_intro;

public class Moreternary {
public static void main(String[] args) {
	String quality="bad";
	int rating=(quality.equals("good"))? 100:0;
	System.out.println("Rating: "+rating);
	
	int PMhour=3;
	//Rush hour during evening 4-7pm
	boolean rushHour=(PMhour>=4 && PMhour<=7 ) ? true: false;
	System.out.println("Is it rush hour?" +rushHour);
	String result= (rushHour==true)?	"yes": "no";
	System.out.println("Is it rush hour?"+result);
	
	int AMhour=10;//6-9
	String amRushHour=(AMhour>=6&&AMhour<=9)? "yes":"no";
	System.out.println("Is it rush hour? "+ amRushHour);
	
	
}
}
