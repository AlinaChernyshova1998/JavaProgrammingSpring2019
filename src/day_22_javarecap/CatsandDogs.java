package day_22_javarecap;

public class CatsandDogs {
public static void main(String[]args) {
	String str="mycatyourcat";
	//count how many cats
	int count=0;
	for(int i=0; i<=str.length()-3;i++){
		String temp=(str.substring(i,i+3));
	if (temp.equalsIgnoreCase("cat")) {
	count++;
	
	}
	
	}
	System.out.println("Count: "+count);
}
}
