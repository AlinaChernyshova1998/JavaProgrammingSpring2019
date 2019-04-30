package day16_string_manipulation;

public class isEmpty {
	public static void main(String[] args) {
		String username = " ";
		String password = "";
		System.out.println(username.isEmpty());
		if (username.isEmpty()) {
			System.out.println("Username field can not be empty");

		} else {
			System.out.println("Username is not empty");
		}
		if (username.isEmpty() || password.isEmpty()) {
			System.out.println("Username or password cannot be empty");
		} else {
			System.out.println("Username or password is not empty");
		}
	}

}
