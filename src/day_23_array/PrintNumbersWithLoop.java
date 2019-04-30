package day_23_array;

public class PrintNumbersWithLoop {
public static void main(String[] args) {
	for( int i=1; i<=10;i++) {
		for(int j=1; j<=i; j++) {
			System.out.print(j+" ");	
		}
		System.out.println();
	}
	System.out.println();
	/////////////////////////reverse///////////////////////
	for( int i=10; i>=1;i--) {
	for(int j=i; j>=1; j--) {
			System.out.print(j+" ");	
		}
		System.out.println();
}
	
}
}
