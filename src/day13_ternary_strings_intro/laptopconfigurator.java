package day13_ternary_strings_intro;

import java.util.Scanner;

public class laptopconfigurator {
public static void main(String[] args) {
	double price = 0,screenSize;
	String storageType, screenType, cpu;
	int ram = 0 ,memorySize;
	Scanner scan = new Scanner(System.in);
//WRITE YOUR CODE HERE
System.out.println("Select screen size:");
screenSize=scan.nextDouble();
if (screenSize==13.3){
 price=price+200;
 }else if(screenSize==15.0){
   price=price+300;
 }else{
   price=price+400;
 }
 System.out.println("Select CPU type:");
 cpu=scan.next();
 if (cpu.equals("i3")){
   price=price+150;
 } else if(cpu.equals("i5")){
   price=price+250;
 }else{
   price=price+350;
 }
 //Then ask user for RAM size. Add  $50 for every 4GB of ram to the laptop price. Then, ask user for storage type. 
 System.out.println("Select RAM size:");
 ram=scan.nextInt();
 if (ram>=4){
   price=price+((ram*50)/4);
 }
 // Then, ask user for storage type. There are 2 options: SSD and HDD. 
 //If it's HDD - add $50 to the laptop price for every 500gb.  If it's SSD - add $100 to the laptop price for every 500GB.
 System.out.println("Select storage type:");
 storageType=scan.next();
 System.out.println("Enter memory size: ");
 memorySize=scan.nextInt();
 if(storageType.equalsIgnoreCase("SSD")) {
	 price=price+(memorySize*100)/500;
 }else if (storageType.equalsIgnoreCase("HDD")) {
	 price=price+(memorySize*50)/500;
 }
 System.out.println("Enter screen resolution: ");
 screenType=scan.next();
 if(screenType.equalsIgnoreCase("FULLHD")){
   price=price+100;
 } else if(screenType.equalsIgnoreCase("4K")){
   price=price+200;
  
 }
 System.out.println("Laptop price is:" +price);
 }

 
 
 
 




}

