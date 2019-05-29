package day_50_;

public class Slack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SlackUser user = new SlackUser("Alina");
AdminUser admin= new AdminUser("Anna");
user.sendAMessage("I love you");
admin.sendAMessage("me too");
	}

}
