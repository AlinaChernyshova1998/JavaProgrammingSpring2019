package day_43_;

public class TeslaDiler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Tesla tesla= new Tesla();
tesla.setModel("Model S");
tesla.setprice(90000);
tesla.setrange(370);
tesla.setzero0To60(2.4);
tesla.setisSelfDriving(true);

System.out.println("Model: "+tesla.getModel());
System.out.println("Price: "+tesla.getprice());
System.out.println("Range: "+tesla.getrange());
System.out.println("Zero to 60: "+tesla.getzero0To60());
System.out.println("Is Sself driving: "+tesla.getisSelfDriving());
System.out.println("is valid model? "+tesla.isValidModel("model x"));
System.out.println(tesla);
System.out.println(tesla.toString());

Tesla myTesla= new Tesla();
myTesla.setInfo("Model x", 3.0, 55000, 260, true);
System.out.println(myTesla.toString());
//how is faster
if(tesla.getzero0To60()>myTesla.getzero0To60()){
	System.out.println("MyTelsa is faster");
}else {
	System.out.println("Telsa is faster");
}
buy(tesla);
buy(myTesla);
System.out.println(testDrive("model x"));

	}
public static void buy(Tesla tesla) {
	System.out.println("Purchasing "+tesla.toString());
	
}
public static Tesla testDrive(String model) {
	System.out.println("I would like to test drive "+ model);
	System.out.println("Sure, let me build the object and return it" );
	Tesla drive= new Tesla();
	drive.setInfo(model, 1.9, 230000, 310, true);
	return drive;
	
}
}
