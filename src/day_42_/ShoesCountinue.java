package day_42_;
import java.util.*;
public class ShoesCountinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shoes shoes1= new Shoes() ;

shoes1.setShoesData("Nike", 6.5);	
System.out.println(shoes1.getShoesData());

Shoes shoes2= new Shoes() ;
shoes2.setShoesData("ALDO", 8.5);	
System.out.println(shoes2.getShoesData());

Shoes shoes3= new Shoes() ;
shoes3.setShoesData("Reebook", 7.5);	
System.out.println(shoes3.getShoesData());
//**************************************************
Shoes[] Arrayshoes= new Shoes[3];
Arrayshoes[0]=shoes1;
Arrayshoes[1]=shoes2;
Arrayshoes[2]=shoes3;
System.out.println(Arrayshoes[0].getShoesData());
System.out.println(Arrayshoes[1].getShoesData());
System.out.println(Arrayshoes[2].getShoesData());


System.out.println(Arrayshoes[0].brand);
System.out.println(Arrayshoes[1].brand);
System.out.println(Arrayshoes[2].brand);
//ArrayList of shoes
ArrayList<Shoes> myShoes= new ArrayList<>();
myShoes.add(shoes1);
myShoes.add(shoes2);
myShoes.add(shoes3);
System.out.println(myShoes.get(0).getShoesData());
System.out.println(myShoes.get(1).getShoesData());
System.out.println(myShoes.get(2).getShoesData());
//read only size 
System.out.println(myShoes.get(0).size);
System.out.println(myShoes.get(1).size);
System.out.println(myShoes.get(2).size);

Shoes redShoes=myShoes.get(1);
System.out.println(redShoes.getShoesData());
//lets use for each loop and print data for each shoes
for(Shoes shoes:myShoes) {
	System.out.print(shoes.getShoesData()+", ");
}
//print name of shoes in the list that size is more then 7
System.out.println();
for(Shoes shoes:myShoes) {
	if(shoes.size>=7.0) {
		System.out.println("Shoes size more then 7: "+shoes.brand);
	}	
	}




	}

}
