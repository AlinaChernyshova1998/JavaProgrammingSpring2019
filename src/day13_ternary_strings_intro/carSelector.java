package day13_ternary_strings_intro;

import java.util.Scanner;

public class carSelector {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	 //americans;// ford, dodge, tesla, chevrolet, lincoln
	//japanese;// toyota, mitsubisi, honda, subaru, mazda||32000
	//german;// bmw, audi, vw, mercedes, porsche||55000
	//italian; // alfa romeo, ferrari, lamborghini||85000
	 //korean;// kia, hyundai, daewoo||25000
	System.out.println("Which type of car are you interested in?");
	int carType=scan.nextInt();
	String carOptions;
	double avaragePrice;
	switch(carType) {
	case 1:
		carOptions=("Ford, Dodge, Tesla, Chevrolet, Lincoln");
		avaragePrice=33000;
		System.out.println("You selected American cars: "+carOptions);
		System.out.println("Avarage price: "+avaragePrice);
		break;
	case 2:
		carOptions=("Toyota, Mitsubisi, Honda, Subaru, Mazda");
		avaragePrice=32000;
		System.out.println("You selected Japanese cars: "+carOptions);
		System.out.println("Avarage price: "+avaragePrice);
		break;
	case 3:
		carOptions=("Bmw, Audi, Vw, Mercedes, Porsche");
		avaragePrice=55000;
		System.out.println("You selected German cars: "+carOptions);
		System.out.println("Avarage price: "+avaragePrice);
		break;	
	case 4:
		carOptions=("carAlfa romeo, Ferrari, Lamborghini");
		avaragePrice=85000;
		System.out.println("You selected Italian cars: "+carOptions);
		System.out.println("Avarage price: "+avaragePrice);
		break;
	case 5:
		carOptions=("Kia, Hyundai, Daewoo");
		avaragePrice=25000;
		System.out.println("You selected Korean cars: "+ carOptions);
		System.out.println("Avarage price: "+avaragePrice);
		break;
		default:
			System.out.println("Car type not available!");	
	}
	
}
}
