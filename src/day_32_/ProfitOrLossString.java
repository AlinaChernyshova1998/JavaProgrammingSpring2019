package day_32_;

public class ProfitOrLossString {
	 public static void main(String[] args){
		    System.out.println(c_profits(40,10));
		  }
		  public static  String c_profits (int buyPrice,int sellPrice){
		    //your code here
		   if(buyPrice>sellPrice){
		     return "loss";
		   }else if(sellPrice>buyPrice){
		     return "profit";
		   }else{
		     return "no loss";
		   }
		   
		   
		  }
		
}
