package day16_string_manipulation;

import java.util.Scanner;

public class url {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter url:");
			String url=scan.next();//www.amazon.com
	if(url.startsWith("www.")) {
		System.out.println("Thats true!");
	}else {
		System.out.println("Thats false!");
		return;	
	}
	int dotIndex=url.length()-4;
	if(url.charAt(dotIndex)=='.') {
	System.out.println(". is there before extension");
	}else {
		System.out.println(". might be not here.");
	}
		String  domain=url.substring(4,dotIndex);//amazon
	System.out.println("Domain: "+domain);
	
	String extension=url.substring(dotIndex+1, url.length());
	System.out.println("Extension: "+extension);
	
}

}


