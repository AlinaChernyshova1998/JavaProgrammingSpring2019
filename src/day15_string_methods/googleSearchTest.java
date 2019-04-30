package day15_string_methods;

public class googleSearchTest {
public static void main(String[] args) {
	String item="java";
	String pageTitle=item+" - Google search";
	// test if pageTitle starts with item 
	if(pageTitle.startsWith(item)) {
	System.out.println("Page Title check passed");	
	}else {
		System.out.println("Fail");
	}
}
}
