package day_45_;

import java.util.Random;

public class Etsy {
	private String email;
	private String name;
	private String password;

	public Etsy() {
		System.out.println("no-args constractor");
		this.email = "";
		this.name = "";
		this.password = "";
	}

	public Etsy(String email, String name, String password) {
		System.out.println("3-args constractor");
		setEmail(email);
		setName(name);
		setPassword(password);
	}

	public Etsy(String email, String name) {
		setEmail(email);
		setName(name);
		this.password = getRandompassword(); // random password
	}

	private String getRandompassword() {
		Random random = new Random();
		String letters = "abcdefghijklmnopqrstuvwxyz0123456789";
		String randomPassword = "";
		for (int i = 0; i <= 6; i++) {
			randomPassword += letters.charAt(random.nextInt(letters.length()));
		}

		return randomPassword;

	}

	public Etsy(String email) {
		// if it contains @ somewhere int the middle. assign it
		// if not print "Please enter a valid email address"
		if (email.indexOf("@") > 0 && email.indexOf("@") != email.length() - 1) {
			this.email = email;
		} else {
			System.out.println("Please enter a valid email address");

		}
	}

	public String toString() {
		return "Etsy [email=" + email + ", Name=" + name + ", Password=" + password + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		// cant be blank
		// needs to be only letters
		if (isValidName(name)) {
			this.name = name;
		} else {
			System.out.println("Invalid name");
			this.name = "invalid";
		}

	}

	private boolean isValidName(String name) {
//check first if it's start with or ends with space
		if (name.startsWith(" ") || name.endsWith(" ")) {
			return false;
		}
		if (name.isEmpty()) {
			System.out.println("Cannot be blank!");
			return false;
		}
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (!Character.isAlphabetic(ch) && ch != ' ') {
				return false;
			}
		}
		return true;

	}

	public String getpassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password.length() < 6) {
			System.out.println("Erorr, Must be at least 6 character");
		} else {
			this.password = password;
		}
	}

}
