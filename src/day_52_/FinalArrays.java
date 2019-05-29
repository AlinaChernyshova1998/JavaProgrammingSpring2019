package day_52_;

import java.util.Arrays;

public class FinalArrays {
public static void main(String[] args) {
	final int [] TEAMS= {11,11};
	System.out.println("Team1: "+TEAMS[0]);
	System.out.println("Team2: "+TEAMS[1]);
	TEAMS[0]=10;
	TEAMS[1]=9;
	System.out.println("Team1: "+TEAMS[0]);
	System.out.println("Team2: "+TEAMS[1]);
	
	int [] nums= new int[] {14,21,36,56};
	System.out.println(Arrays.toString(nums));
	nums= new int[] {256,2568,112,888,444};
	System.out.println(Arrays.toString(nums));
	
	final int [] finalNums= new int [] {23,42,56,44};
	System.out.println(Arrays.toString(finalNums));
	finalNums[0]=2569;
//	finalNums=new int [] {12,52,66,74};//not compile, because you change size(length) of array,
	
	final double[] prices= new double [3];
	prices[0]=55.3;
	prices[1]=99.99;
	prices[2]=58.36;
	System.out.println(Arrays.toString(prices));
	prices[0]=25.3;
	prices[1]=89.3;
	prices[2]=58.36;
	System.out.println(Arrays.toString(prices));
}
}
