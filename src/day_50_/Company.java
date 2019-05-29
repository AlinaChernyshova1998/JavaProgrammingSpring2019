package day_50_;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee employee= new Employee();
FullTimeEmployee fullTime= new FullTimeEmployee();
ContractorEmployee contractor = new ContractorEmployee();
employee.calculatePay(40, 55);
fullTime.calculatePay(35, 70);
contractor.calculatePay(40, 60);
	}

}
