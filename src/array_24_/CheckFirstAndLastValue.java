package array_24_;

public class CheckFirstAndLastValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//write a program where will print true
		//if first and last num is the same
		//if first and last value in the array of ints is same, print true
		int [] numbers= {12,23,13,45,12};
		boolean equals= numbers[0]==numbers[numbers.length-1];
		System.out.println(equals);
				
		char[] chars= new char[3];
		System.out.println("Value of chars:"+chars[0]);
		System.out.println(chars[0]+0);
		}
	}

