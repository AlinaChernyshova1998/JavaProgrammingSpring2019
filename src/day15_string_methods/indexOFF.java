package day15_string_methods;

public class indexOFF {
public static void main(String[] args){
	String word1="github";
	System.out.println(word1.indexOf("g"));
	System.out.println(word1.indexOf("th"));
	System.out.println(word1.indexOf("hub"));
	System.out.println(word1.indexOf("java"));
	String url="www.okta.com";
	int index=url.indexOf(".");
	System.out.println("Post of . :"+index);
	System.out.println(url.charAt(index+1));
	
	String title="Java - Google Search";
	int dash =title.indexOf('-');
	System.out.println(title.charAt(dash-2));
	System.out.println(title.charAt(dash+2));
	System.out.println(title.indexOf('-'));
	String country="United States of America";
	int states=country.indexOf("States");
	System.out.println("Position of states: "+states);
	
	String word2="java, c++, python, tomcat, eclipse";
	//check if c++ is in word2
	//using contains
	if(word2.contains("c++")) {
		System.out.println("c++ is there");
}else {
	System.out.println("c++ not there");
}	
	//using indexOf
	if(word2.indexOf("c++")>=-1) {
		System.out.println("c++ is there");
	}else {
		System.out.println("c++ is not there");
	}

}
}
