package day15_string_methods;

public class StartsandEnds {
public static void main(String [] args) {
	String word1="eclipse";
	//startsWith ==> tests if string starts with another 
	System.out.println(word1.startsWith("e"));//true
	System.out.println(word1.startsWith("ec"));//true
	System.out.println(word1.startsWith("Ec"));//false
	System.out.println(word1.endsWith("e"));//true
	System.out.println(word1.endsWith("pse"));//true



String name= "Mr. Jackson" ;
if(name.startsWith("Mr.")) {
	System.out.println("man");
	
}else if(name.startsWith("Mrs.")) {
	System.out.println("married women");
}else if(name.startsWith("Ms.")) {
	System.out.println("single women");
}else if(name.startsWith("Dr.")) {
	System.out.println("doctor");

}
}
}