package day_23_array;

public class loopWarmUp {
	public static void main(String[] args) {

		for (char i = 'a'; i <= 'e'; i++) {                    //aa, ab, ac, ad, ae, ba.... until ee
			                                         
			for (char j = 'a'; j <= 'e'; j++) {

				System.out.print(i);
				System.out.println(j);
			}

		}
	}
}