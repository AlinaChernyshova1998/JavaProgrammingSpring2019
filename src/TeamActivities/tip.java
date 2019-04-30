package TeamActivities;

import java.util.Scanner;

public class tip {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//Poor = 5%
		//Fair = 10%
		//Good = 15%
		//Great = 20%
		//Excellent = 25% 
		String serviceQuality;
		int numberOfTip, numOfPPL;
		String tipName, numberofpeople; 
		boolean splitChecks=true;
		String splitCheck1;
	
		double checkTotal, totalPerPerson, TipPerPerson;
		double totalTip=0;
		System.out.println("Split:");
		splitCheck1=scan.next();
		if(splitCheck1.equalsIgnoreCase("yes")){
			  splitChecks=true;
			}else{
			  splitChecks=false;
			}
		System.out.println("Number of people:");
		numOfPPL=scan.nextInt();
		System.out.println("Check amount:");
		checkTotal=scan.nextDouble();
		System.out.println("Service Quality:");
		serviceQuality=scan.next();
		numberofpeople="";
		switch(numOfPPL) {
		case 1:
			numberofpeople="&";
			break;
		case 2:
		numberofpeople="&&";
			break;
		case 3:
		numberofpeople="&&&";
			break;
		case 4:
		numberofpeople="&&&&";
			break;
		case 5:
		numberofpeople="&&&&&";
			break;
		case 6:
		numberofpeople="&&&&&&";
			break;
		case 7:
			numberofpeople="&&&&&&&";
			break;
		case 8:
		numberofpeople="&&&&&&&&";
			break;
		case 9:
		numberofpeople="&&&&&&&&&";
			break;
		case 10:
		numberofpeople="&&&&&&&&&&";
			break;
			
		}
		System.out.println("Number of people entered: "+numberofpeople);
		switch(serviceQuality){
		case "poor":
			totalTip=(checkTotal*5)/100;
			break;
		case "fair":
			totalTip=(checkTotal*10)/100;
			break;
		case "good":
			totalTip=(checkTotal*15)/100;
			break;
		case "great":
			totalTip=(checkTotal*20)/100;
			break;
		case "excellent":
			totalTip=(checkTotal*25)/100;
			break;
			default:
				System.out.println("Invalid valid");
		}
		
		// split
		
		if (splitChecks==true) {
			totalPerPerson=checkTotal/numOfPPL;
			TipPerPerson=totalTip/numOfPPL;
			
			System.out.println("Total to pay: "+checkTotal);
			System.out.println("Total tip: "+totalTip);
			System.out.println("Total per peson: "+totalPerPerson);
			System.out.println("Tip per person: "+TipPerPerson);
		}else {
			System.out.println("Total to pay: " +checkTotal);
			System.out.println("Total tip: "+totalTip);
		}
			
		
			
			
		}
		
	}

