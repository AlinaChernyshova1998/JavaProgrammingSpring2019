package day_31_methods;

public class Authentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login("alina1998", "alina1111");
	}
public static void login(String username, String password) {
	String Validusername="mentoring@cybertekschool.com";
	String Validpassword="mentor001";
	
	if(username.equals(Validusername)&&password.equals(Validpassword)) {
		System.out.println("Welcome to Okta");
		
		}else {
			System.out.println("Wrong password and user name");
		}
	
	}
}

