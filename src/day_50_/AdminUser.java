package day_50_;

public class AdminUser extends SlackUser {

	public AdminUser(String name) {
		super(name);
		
	}
	public void sendAMessage(String message) {
		System.out.println("Add channel");
		System.out.println(getName() + " is sending a message: " + message);
	}

}
