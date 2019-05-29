package day_46_;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String name=Company.companyName;
 System.out.println("Company name: "+name.toUpperCase());
 //or
 Company c = new Company();
 System.out.println(c.companyName);
 c.companyInfo();

	}

}
