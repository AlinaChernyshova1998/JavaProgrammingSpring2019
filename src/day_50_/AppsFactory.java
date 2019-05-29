package day_50_;

public class AppsFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IphoneApp iphone = new IphoneApp();
IphoneApp iphone1 = new IphoneApp("Uber");

AndroidApp android = new AndroidApp();
AndroidApp android1 = new AndroidApp("Lift");

System.out.println(iphone.getName());
System.out.println(android.getName());
System.out.println(iphone1.getName());
System.out.println(android1.getName());

App.build("Swift");
IphoneApp.build("Objective C");
AndroidApp.build("Java");
	}

}
