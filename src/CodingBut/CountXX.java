package CodingBut;

public class CountXX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(countXX("abcxxxxxx"));
	}
	public static int countXX(String str) {
	
		  int count=0;
		  
		  for(int i=0; i<str.length()-1; i++){
		  if(str.substring(i, i+2).equalsIgnoreCase("xx")){
		   count++; 
		  }
		
		  }
		return count;
		
}
}