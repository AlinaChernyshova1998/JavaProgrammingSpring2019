package day_21_recapJava;

public class uniqCharecter {
public static void main(String[] args) {
	
	String word="javaav";
	String unique="";
	char first=word.charAt(0);
	
	System.out.println(unique.contains(""+first));
	System.out.println(unique.indexOf(0));
	if(!unique.contains(""+first)) {
		unique=unique+first;//unique+=first
	}
	if(unique.indexOf(first)==-1){
		unique+=first;
		
		
	}
	System.out.println("Unique:"+unique);
	//=========================================
	String word2="bananas";
	String unique2="";
	int i=0;
	char ch2=word2.charAt(i);
	System.out.println("Ch2:"+ch2);
	i++;
	ch2=word2.charAt(i);
	System.out.println("Ch2:"+ch2);
	if(unique.contains(""+ch2)) {//""+char=string; 
		System.out.println("Ch2:"+ch2);
	}
}
}
