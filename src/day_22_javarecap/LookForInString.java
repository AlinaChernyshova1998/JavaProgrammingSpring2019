package day_22_javarecap;

public class LookForInString {
public static void main(String[]args) {
	String sentense="He said hi, then she replied hi. hi guys!";
	//print letters in pairs
	int count=0;
	for (int i=0; i<=sentense.length(); i++) {
		String temp=sentense.substring(i,i+2);
		System.out.println(temp);
		if(temp.equalsIgnoreCase("hi")){
	count++;
	
	}
		System.out.println("Count:"+count);
}
	
}
}