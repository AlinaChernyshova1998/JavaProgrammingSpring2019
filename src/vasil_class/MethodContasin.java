package vasil_class;

public class MethodContasin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(stringE("heeelooo"));
	}
	public static boolean stringE(String str) {
		 
		 int count = 0;

		  for (int i=0; i<str.length(); i++) {
		    if (str.charAt(i) == 'e'){
		    count++;
		    }
		}
		return (count>=1 && count<=3);


		}

}
