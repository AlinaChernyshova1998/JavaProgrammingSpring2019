package array_24_;

import java.util.Arrays;

public class ArrayContinue {
public static void main(String[]args) {
	//let's creat an array of integers length 3
	int[] numbers= new int[3];
	numbers[0] =5;
	numbers [1]=10;
	numbers [2]=20;
	System.out.println(numbers);//[I@368239c8
	//toString() from arrays can helps us to print an arrays as string
	System.out.println(Arrays.toString(numbers));
	System.out.println();
	int sum=0;
	for(int i=0; i<numbers.length; i++) {
		sum+=numbers[i];
		
}
	System.out.println("Sum: "+sum);
	//find largest value in array
	int max=Integer.MIN_VALUE;
	//System.out.println(Integer.MIN_VALUE);
	for (int i=0;i<numbers.length; i++) {
		if(numbers[i]>max) {
			max=numbers[i];
		}
	}
	System.out.println("Max value:"+max);
	int min=Integer.MAX_VALUE;
	for(int k=0;k<numbers.length; k++) {
		if(numbers[k]<min) {
			min=numbers[k];
		}
	}
			
	System.out.println("Min value:"+min);
	
}
}