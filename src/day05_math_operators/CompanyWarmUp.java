package day05_math_operators;

public class CompanyWarmUp {
// Declare variables:
	//company name
	//address
	//numberOfEmployees
	//revenue
	//isTechCompany
	public static void main(String[] args) {
 String company="Facebook";
 String address= "Silicon Valley,CA";
 int numberOfEmployees=10000;
 long revenue=4000000l;
 boolean isTechCompany= true;
 System.out.println("Company name is " + company);
 System.out.println("address is " + address);
 System.out.println("Number of employees is " + numberOfEmployees);
 System.out.println("Annual revenue is ? " + revenue);
 System.out.println("is it tech company? " + isTechCompany);
 
 String aboutCompany="Company " +company+ " is located in " + address;
 System.out.println(aboutCompany);
	}
 
}
