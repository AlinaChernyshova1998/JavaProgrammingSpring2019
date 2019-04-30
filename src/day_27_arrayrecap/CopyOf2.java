package day_27_arrayrecap;

import java.util.Arrays;

public class CopyOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] num1= {25,26,36,69};
//copy all the values in array and add 2 values
int [] num2=Arrays.copyOf(num1, num1.length+2);
int [] num3=Arrays.copyOfRange(num1, 1,3);
System.out.println("Num3: "+Arrays.toString(num3));
System.out.println(Arrays.toString(num2));
num2[4]=100;
num2[5]=200;
System.out.println(Arrays.toString(num2));
int[] brandNew= {34,55,69,25};
brandNew=Arrays.copyOf(brandNew, brandNew.length+5);
System.out.println(Arrays.toString(brandNew));
System.out.println(brandNew.length);
brandNew[4]=236;
brandNew[5]=288;
brandNew[6]=276;
brandNew[7]=296;
brandNew[8]=256;
System.out.println(Arrays.toString(brandNew));
	}

}
