package vasil_class;
import java.util.*;
public class CombineReplit {
	  public static void main(String[]args){
		    //System.out.println(combineAll)
		  ArrayList<String> wordList1=new ArrayList<>();
		  wordList1.add("alina");
			wordList1.add("anna");
			wordList1.add("elena");
			
			ArrayList<String> wordList2=new ArrayList<>();
			wordList2.add("adfgh");
			wordList2.add("jenya");
			wordList2.add("samir");
			
				System.out.println(combineAll(wordList1,wordList2));
		  }

			//create your method below
		public static ArrayList<String> combineAll(ArrayList<String> wordList1, ArrayList<String> wordList2){
		wordList1.addAll(wordList2);
		
			return wordList1;
		  
		}	
		}

