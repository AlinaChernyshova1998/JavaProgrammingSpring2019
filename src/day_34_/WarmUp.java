package day_34_;

import java.util.Arrays;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(findOccurences(new int []{45,22,66,5,55,5,66,20,20,21,5,22},5));
//or
int [] nums={45,22,66,5,55,5,66,5,22,20,25,66,20,5};
int five=findOccurences(nums,5);
if(five>0) {
	System.out.println("We have 5s and how many: "+five);
}else {
	System.out.println("We dont have 5s");
}
int twenty=findOccurences(nums,20);
if(twenty>0) {
	System.out.println("We have 20s and how many: "+twenty);
}else {
	System.out.println("We dont have 20s");
}
	}
public static int findOccurences(int [] array, int value) {
	int count=0;
	for(int num:array) {
		if(num==value) {
			count++;
			
		}
	}
	//System.out.println("How many "+value+" contains in array: "+ count);
	return count;
	
}
}
