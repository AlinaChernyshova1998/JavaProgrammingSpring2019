package day_47_;

import java.time.LocalDateTime;

public class BriteERP {
static {
	System.out.println("Launch browser");
	System.out.println("Navirate to: "+testData.url);
	
}
public static void enterEmail() {
	System.out.println("Enter email: "+testData.email);
	
}
public static void enterPassword() {
	System.out.println("Enter password: "+testData.password);
	
}
public static void verifyLogIn() {
	System.out.println("Excpected Name: "+testData.userName);
	System.out.println("Actual Name displayed");
	System.out.println("login successful"+LocalDateTime.now());
	
}
}
