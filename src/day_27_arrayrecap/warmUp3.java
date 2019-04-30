package day_27_arrayrecap;

public class warmUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tools = { "JAVA", "Selenium", "TestNG", "JUnit", "Cucumber", "Git", "Maven" };
		/*
		 * Java --> programming language Selenium --> Test Automation TestNG --> Unit
		 * Tests JUnit --> Unit Tests Cucumber --> BDD Style testing Git --> Version
		 * control Maven --> Building and execution for project
		 */
		for (String tool : tools) {
			if (tool.equalsIgnoreCase ("Java")) {
				System.out.println("Java-programming language");
			} else if (tool.equalsIgnoreCase("Selenium")) {
				System.out.println("Selenium-Test Automation");
			} else if (tool.equalsIgnoreCase ("TestNG")) {
				System.out.println("TestNG-Unit tests");
			} else if (tool.equalsIgnoreCase ("JUnit")) {
				System.out.println("JUnit-Unit tests");
			} else if (tool.equalsIgnoreCase("Cucumber")) {
				System.out.println("Cucumber-BDD Style testing");
			} else if (tool.equalsIgnoreCase("Git")) {
				System.out.println("Git-Version control");
			} else if (tool.equalsIgnoreCase ("Maven")) {
				System.out.println("Maven-Building and execution for project");
			}else {
				System.out.println("Unknown tool");
			}
		}
	}
}