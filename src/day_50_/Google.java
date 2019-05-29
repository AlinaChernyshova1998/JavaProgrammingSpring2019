package day_50_;

public class Google extends SearchEngine{
	public int search(String word) {
		System.out.println("Searching for: "+word);
		int resultsCount=word.length();
		return resultsCount;
	}//protected
	public void search(String item, String item2) {
		System.out.println("Searching for 2 etims: "+item+","+item2);
		int resultsCount=item.length()+item2.length();
		System.out.println("Total count: "+resultsCount);
		
	}//default , protected
	protected String clickResult() {
		System.out.println("Clicking result");
		return "Searching result page";
	}
}
