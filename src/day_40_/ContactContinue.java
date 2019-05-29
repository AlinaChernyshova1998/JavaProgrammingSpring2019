package day_40_;

public class ContactContinue {
	public static void main(String[] args) {
		Contact contact1= new Contact();
		contact1.phoneNumber=2024685109;
		contact1.name="Alina Cher";
		contact1.email="alina.cher1998@gmail.com";
		System.out.println("Name: "+ contact1.name);
		System.out.println("Phone number: "+ contact1.phoneNumber);
		System.out.println("Email: "+ contact1.email);
	contact1.call();
	contact1.sendMessage();
	
	Contact contact2= new Contact();
	contact2.phoneNumber=703569442;
	contact2.name="Anna Chernyshova";
	contact2.email="anna.cher1998@gmail.com";
	System.out.println("Name: "+ contact2.name);
	System.out.println("Phone number: "+ contact2.phoneNumber);
	System.out.println("Email: "+ contact2.email);
	contact2.call();
	contact2.sendMessage();
	}
 
 
}
