package day_51_;

public class SportCenter {
public static void main(String[] args) {
	Sport gym= new Sport();
	Running run= new Running();
	Swimming swim= new Swimming();
	Yoga yoga= new Yoga();
	Juijuitsu juijuitsu= new Juijuitsu();
	Snowboarding snowboarding = new Snowboarding();
	gym.perform(20);
	run.perform(30);
	swim.perform(60);
	yoga.perform(55);
	juijuitsu.perform(45);
	snowboarding.perform(35);
}
}
