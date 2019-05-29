package day_38_;
import java.util.*;
public class RemoveAll1 {
	public static void main(String[]srgs){
		
		  ArrayList<String> wordList = new ArrayList<String>();
		  wordList.add("hi");
		  wordList.add("hey"); 
		   wordList.add("hi");
		    wordList.add("you");
		    	String targetWord="hi";
		    removeAll(wordList,targetWord);
		  
		}
			public static void removeAll(ArrayList<String> wordList, String targetWord){
             ArrayList<String>targetWord1= new ArrayList <> (Arrays.asList(targetWord));
			      wordList.removeAll(targetWord1);
			      System.out.println(wordList.toString());
			    
			  

			  
			}
		
}