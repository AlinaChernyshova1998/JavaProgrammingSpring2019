package vasil_class;

public class XtraEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(extraEnd("Hello"));
	}
	public static  String extraEnd(String str) {
		  if(str.length()==2){
		    return str+str+str;
		  }else if(str.length()>3) {
			return str.substring(str.length()-2)+str.substring(str.length()-2)+str.substring(str.length()-2);
		  }
		return str;
	
		 
		  }
		
}
