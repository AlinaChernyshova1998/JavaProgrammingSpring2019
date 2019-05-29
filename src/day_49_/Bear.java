package day_49_;

public class Bear extends Animal {
public Bear() {
	super();//call parent 
System.out.println("Bear constractor");	
setType("Bear");
}
public Bear(String type ) {
super(type);//call animal string type
System.out.println("Bear-1 arg constractor");


}
}
