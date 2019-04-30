package day_18_loop;

public class Staircase {
public static void main(String[] args) {
	String star="*";
	
	int num=1;
	while (num<=10) {
		System.out.println(star);
		star+="*";
		num++;
	}
	//or
	star="*";
	while(star.length()<=10) {
		System.out.println(star);
		star+="*";
	}
	
}
}
