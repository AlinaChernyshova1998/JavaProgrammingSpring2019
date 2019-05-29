package CodingBut;

public class delDel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(delDel("adelbc"));
	}
	public static  String delDel(String str) {
	
		  if(str.length()>=4 && str.substring(1,4).equals("del")){
		return str.substring(0,1)+""+str.substring(4);
		
		  }
		  return str;
		}
}