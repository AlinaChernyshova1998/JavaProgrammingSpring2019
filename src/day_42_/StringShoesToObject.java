package day_42_;
import java.util.*;
public class StringShoesToObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "Bruno Magli,9.5";
		//split make and size with substring
		String make=data.substring(0, data.indexOf(","));
		System.out.println(make);
		String size=data.substring(data.indexOf(",")+1);
		System.out.println(size);
		System.out.println(make+" | "+size);
		
		//split with Array
		String [] ArrayData= data.split(",");
		//create shoes object
		Shoes shoes= new Shoes();
		shoes.setShoesData(ArrayData[0], Double.parseDouble(ArrayData[1]));
		
		System.out.println(shoes.getShoesData());
		//creat object with the scanner
		Scanner scan= new Scanner(System.in) ;
		System.out.println("What shoes brand are you looking for: ");
		String brand=scan.next();
		System.out.println("What shoes size are you looking for: ");
		double sizeShoes=scan.nextDouble();
		Shoes shoes1= new Shoes();
		shoes1.setShoesData(brand, sizeShoes);
		System.out.println(shoes1.getShoesData());
		
		
		
		
	}

}
