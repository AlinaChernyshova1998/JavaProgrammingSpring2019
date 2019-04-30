package day_26_arraycontinue;

import java.util.Arrays;
import java.util.Random;

public class warmUpNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = { "James", "Mary", "John", "Patricia", "Robert", "Jennifer", "Michael", "Linda", "William",
				"Elizabeth", "David", "Barbara", "Richard", "Susan", "Joseph", "Jessica", "Thomas", "Sarah", "Charles",
				"Margaret", "Christopher", "Karen", "Daniel", "Nancy", "Matthew", "Lisa", "Anthony", "Betty", "Donald",
				"Dorothy", "Mark", "Sandra", "Paul", "Ashley", "Steven", "Kimberly", "Andrew", "Donna", "Kenneth",
				"Emily", "George", "Carol", "Joshua", "Michelle", "Kevin", "Amanda", "Brian", "Melissa", "Edward",
				"Deborah", "Ronald", "Stephanie", "Timothy", "Rebecca", "Jason", "Laura", "Jeffrey", "Helen", "Ryan",
				"Sharon", "Jacob", "Cynthia", "Gary", "Kathleen", "Nicholas", "Amy", "Eric", "Shirley", "Stephen",
				"Angela", "Jonathan", "Anna", "Larry", "Ruth", "Justin", "Brenda", "Scott", "Pamela", "Brandon",
				"Nicole", "Frank", "Katherine", "Benjamin", "Samantha", "Gregory", "Christine", "Raymond", "Catherine",
				"Samuel", "Virginia", "Patrick", "Debra", "Alexander", "Rachel", "Jack", "Janet", "Dennis", "Emma",
				"Jerry", "Carolyn", "Tyler", "Maria", "Aaron", "Heather", "Henry", "Diane", "Jose", "Julie", "Douglas",
				"Joyce", "Peter", "Evelyn", "Adam", "Joan", "Nathan", "Victoria", "Zachary", "Kelly", "Walter",
				"Christina", "Kyle", "Lauren", "Harold", "Frances", "Carl", "Martha", "Jeremy", "Judith", "Gerald",
				"Cheryl", "Keith", "Megan", "Roger", "Andrea", "Arthur", "Olivia", "Terry", "Ann", "Lawrence", "Jean",
				"Sean", "Alice", "Christian", "Jacqueline", "Ethan", "Hannah", "Austin", "Doris", "Joe", "Kathryn",
				"Albert", "Gloria", "Jesse", "Teresa", "Willie", "Sara", "Billy", "Janice", "Bryan", "Marie", "Bruce",
				"Julia", "Noah", "Grace", "Jordan", "Judy", "Dylan", "Theresa", "Ralph", "Madison", "Roy", "Beverly",
				"Alan", "Denise", "Wayne", "Marilyn", "Eugene", "Amber", "Juan", "Danielle", "Gabriel", "Rose", "Louis",
				"Brittany", "Russell", "Diana", "Randy", "Abigail", "Vincent", "Natalie", "Philip", "Jane", "Logan",
				"Lori", "Bobby", "Alexis", "Harry", "Tiffany", "Johnny", "Kayla" };
		// print numbers of names
		System.out.println("Names count: " + names.length);
		// print all names in single line
		System.out.println(Arrays.deepToString(names));
		// print 2 names
		for (int k = 0; k < names.length; k += 2) {
			System.out.println(names[k] + ", " + names[k + 1]);
		}
		System.out.println("Male names:");
		// print out men's names
		for (int i = 0; i < names.length; i += 2) {
			System.out.print(names[i] + ", ");
		}
		// print women's names
		System.out.println();
		System.out.println("&&&&&&&&&&&&&&&&&&&&");
		System.out.println("Female names:");
		for (int j = 1; j < names.length; j += 2) {
			System.out.print(names[j] + ", ");
		}

		// or we can find female names another way
		System.out.println();
		System.out.println("&&&&&&&&&&&&&&&&&&&&");
		System.out.println("Female names:");
		for (int m = 0; m < names.length; m++) {
			if (m % 2 != 0) {

				System.out.print(names[m] + ", ");
			}

		}
		// print random name
		// use random class
		System.out.println();
		Random random = new Random();
		int r = random.nextInt(names.length);
		System.out.println("Random name: " + names[r]);

		// print all names that are up to characters in uppercase
		System.out.println();
		for (String name : names) {
			if (name.length() <= 4) {
				System.out.print(name.toUpperCase() + " , ");
			}
		}
		System.out.println();
		String namesUpto4 = " ";
		String names5to6 = " ";
		String names7to8 = " ";
		for (String name : names) {
			if (name.length() <= 4) {
				namesUpto4 += name + " , ";
			} else if (name.length() == 5 || name.length() == 6) {
				names5to6 += name + ", ";
			} else {
				names7to8 += name + ", ";
			}

		}
		System.out.println("Names Up to 4 characters: " + namesUpto4.substring(0, namesUpto4.lastIndexOf(",")));
		System.out.println("Names who have 5 and 6 characters: " + names5to6.substring(0, names5to6.lastIndexOf(",")));
		System.out.println("Names who have 7 and 8 characters: " + names7to8.substring(0, names7to8.lastIndexOf(",")));
		System.out.println(Arrays.deepToString(names));
		//change position name 
		String temp="";
		for(int i =0;i<names.length; i+=2 ) {
			 temp=names[i];
			names[i]=names[i+1];
			names[i+1]=temp;
			
		}
		System.out.println(Arrays.deepToString(names));
	}
}