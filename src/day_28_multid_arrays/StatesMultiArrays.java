package day_28_multid_arrays;

import java.util.Arrays;

public class StatesMultiArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] states=new int[3][4];
states[0][0]=12000;
states[0][1]=13000;
states[0][2]=14000;
states[0][3]=15000;


states[1][0]=1000;
states[1][1]=2000;
states[1][2]=3000;
states[1][3]=4000;


states[2][0]=100;
states[2][1]=200;
states[2][2]=300;
states[2][3]=400;
System.out.println("First state and first city has population: "+states[0][0]);
System.out.println("Second state and first city has population: "+states[1][0]);
System.out.println("Third state and first city has population: "+states[2][0]);
System.out.println(Arrays.deepToString(states));
System.out.println(Arrays.toString(states[0]));

int [] [] score= { {3,5,10},{6,8,4,9} };
System.out.println("Days played/Number of arrays: "+score.length);
System.out.println("Number of values in 1: "+score[0].length);
System.out.println("Number of values in 2: "+score[1].length);

int [][]values=new int[4][];
values[0]=new int[] {33,12};
values[1]=new int[] {10,20,30};
values[2]=new int[2] ;
values[2][0]=25;
values[2][1]=255;
values[3]=new int[] {55,66,77,88} ;



	}

}
