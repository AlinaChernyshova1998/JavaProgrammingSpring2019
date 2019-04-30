package day08_scanner;

public class ifElseVariables {
public static void main(String[] args) {
int temprature=45;
if(temprature>=65) {
	System.out.println("It's a nice day");
}else{
	System.out.println("Stay home and code Java");
	
	//2 int variables, teamAScore, teamBScore
	//put condition. check if teamA won, if yes. "TEAM A won"
	// else " teamB won or it was a draw
	// go teams!
	
	int teamA=11;
	int teamB=15;
	if(teamA>teamB) {
		System.out.println("Team A won ");
		System.out.println("Go team A");
	}else{
		System.out.println("Team B won");
		System.out.println("Go team B");
	}
}
}
}
