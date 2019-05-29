package day_46_;

public class Ebay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer1= new Customer("Abdallah", "abdalah1978@gmail.com");
		System.out.println(customer1.count+" "+customer1.toString());
		Customer customer2= new Customer("Alina Chernyshova", "alina.cher1998@yahoo.com" );
		System.out.println(customer2.count+" "+customer2.toString());
		Customer customer3= new Customer("Adilet Kurguz", "adilet.856@mail.ru");
		System.out.println(customer3.count+" "+customer3.toString());
		Customer customer4= new Customer("Anna Romashkina", "annromashkina1988@gmail.com");
		System.out.println(customer4.count+" "+customer4.toString());
		customer1.count=10;
		System.out.println(customer3.count);
	}

}
