package vasil_class;

import java.util.Arrays;

public class ArraysInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] num= {1,1,15,6,7,9};
int [] num1= {25,66,77,88};
//Arrays.parallelSort(num);
//System.out.println(Arrays.toString(num));
isArraySorted(num1);
	}
	public static void isArraySorted(int []num) {
		boolean sorted=true;
		for(int i=0; i<num.length-1; i++) {
			System.out.println(num[i]+" "+num[i+1]);
			if(num[i]>num[i+1]) {
			sorted=false;
			break;
			}
		}
	
		System.out.println("Is Array sorted: "+sorted);
		//System.out.println(Arrays.toString(num));
	}
	}


