package vasil_class;
import java.util.*;
public class SuperHero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] arr1= {"word"};
		String [] arr2= new String [2];
		String [] arr3= new String [] {"apple", "kiwi"};
		arr2[0]="one more word";
		arr2[1]="one more new word";
		System.out.println(Arrays.toString(arr2));
	
		String [] superHero= {"Spiderman", "Iron man", "Hulk", "Wonder Woman", "Thor", "Batman", "Hellboy",
				"Superman", "Flash", "Captain America", "Ant-Man", "Aquaman"};
	//	count how many superherous we have with space in the name
		int count=0;
		String heroWithSpaces="";
		for(int i=0; i<superHero.length; i++) {
			if(superHero[i].contains(" ")) {
				heroWithSpaces=	heroWithSpaces+superHero[i]+", ";
				count++;
			}
		}
		System.out.println("Name with the space: "+count);
		System.out.println(heroWithSpaces.substring(0,heroWithSpaces.length()-2));
		
		String [] newHeroes= heroWithSpaces.split(", ");
		System.out.println(Arrays.toString(newHeroes));
		
		
	}
	

}
