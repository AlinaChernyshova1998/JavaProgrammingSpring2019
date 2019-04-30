package vasil_class;

import java.util.Scanner;

public class UniqueNumbers {
	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    String[] words = new String[size];
		    for(int i=0; i < size; i++){
		      words[i] = scan.next();
		    }
		    printUniqueWords(words);
		  }
		  
		  public static void printUniqueWords(String[] words){
		    //WRITE YOUR CODE HERE
		    String unique="";
		    for(String word:words){
		      int count=0;
		      for(String word1:words){
		        if(word.equals(word1)){
		          count++;
		        }
		      }
		      if(count==1){
		        System.out.println(word);
		      }
		    }
		 
		   
		   
		   
		    
		  }
		
}
