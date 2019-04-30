package day_22_javarecap;

public class reversednumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 243567;
		int reversedI = 0;
	while(i>0) {
		reversedI=reversedI*10;
		reversedI=reversedI+i%10;
		i=i/10;
		
	}
	System.out.println("Revesed number "+reversedI);
	}

}
