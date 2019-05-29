package vasil_class;

public class NTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringTimes("Hello", 3));
	}

	public static  String stringTimes(String str, int n) {
		String str1="";
	
		  if(n>0){
		 for(int i=0; i<n; i++) {
			str1+=str; 
		 }
	}
		return str1;  
	}
}