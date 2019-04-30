package day30_methods2;

public class EtsySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		navigateToEtsy();
		searchForWoodenSpoon();
		printResults();
	}
	
	public static void navigateToEtsy() {
		System.out.println("Launch Chrome browser");
		System.out.println("Navigate to www.etsy.com");
	}

	public static void searchForWoodenSpoon() {
		System.out.println("Type 'Wooden spoon' into search field");
		System.out.println("Click on 'Search' button");
	}
	
	public static void printResults() {
		System.out.println("“wooden spoon” (14,720 Results)");
	}


	}

