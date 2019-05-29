package day_38_;
import java.util.*;
public class combine2Arraysin1ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] r1= new String[] {"f","o","o"};
		String [] r2= new String[] {" b","a","r"};
		System.out.println(combineRs(r1,r2));
		
//System.out.println(combineRs());
	}
	 public static String combineRs(String[] r1,String[] r2)  {
		  ArrayList<String> sr1=new ArrayList<>();
		  ArrayList<String> sr2=new ArrayList<>();  
		  sr1.addAll(sr2);
		return sr1.toString();
	 }		
}
