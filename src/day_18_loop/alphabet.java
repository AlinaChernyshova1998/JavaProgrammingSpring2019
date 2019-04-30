package day_18_loop;

public class alphabet {
public static void main(String[]args) {
	char letter='a';
	while (letter<='z') {
		System.out.print(letter+" ");
		letter++;
		
	}
	System.out.println();
	char letter2='z';
	while(letter2 >='a') {
		System.out.println(letter+" ");
		letter2--;
	}
	char capitals='A';
    
    while(capitals<='Z') {
        System.out.println(capitals+ " ");
    capitals++;
    }
    System.out.println();
     char reverse='Z';
    
    while(reverse>='A') {
        System.out.print(reverse+ " ");
    reverse--;
    }
    char myLetter='A';
    String letters="";
    
    while(myLetter<='Z') {
    letters=letters+myLetter;
    System.out.println(letters);
    myLetter++;
    }
    
    
    
}


}
