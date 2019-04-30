package day_28_multid_arrays;

import java.util.Arrays;

public class SoccerTeams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] [] teams=new String [2][6]; 
//declare MultiD array 2 rows and 6 cols
teams[0][0]="Irina";
teams[0][1]="Zarif";
teams[0][2]="Cihan";
teams[0][3]="Habib";
teams[0][4]="Adel";
teams[0][5]="Bojan";

teams[1][0]="Olim";
teams[1][1]="Mirshod";
teams[1][2]="Usman";
teams[1][3]="Nursultan";
teams[1][4]="Roman";
teams[1][5]="Dmitriy";
System.out.println("First player first team: "+teams[0][0]);//irana
System.out.println("First player second team: "+teams[1][0]);//olim
//print how many teams 
System.out.println(teams.length);
//how many ppl in first team
System.out.println(teams[0].length);//6ppl
//how many ppl in second team
System.out.println(teams[1].length);//6ppl
System.out.println(Arrays.deepToString(teams));

	}

}
