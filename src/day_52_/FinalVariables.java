package day_52_;

public class FinalVariables {
	public final int MAX_RANGE = 610;
	public final int MAX_SPEED;
	public final int MODEL_X_PASSENGERS;
	public final String JAN= "January";
	public static final String COMPANY_NAME="Cybertek";
	public static final String ADMIN_USERNAME;
static {
	ADMIN_USERNAME="admin@gmail.com";
}
	public FinalVariables() {
		MAX_SPEED = 180;
	}

	{
		MODEL_X_PASSENGERS = 7;
	}

	public static void main(String[] args) {
		final int MAX_PASSANGERS_COUNT = 5;
		final int SSN;
		SSN = 325648855;
		FinalVariables finalVar= new FinalVariables();
System.out.println("MAx range for roodster: "+ finalVar.MAX_RANGE);
System.out.println("MAx speed for roodster: "+ finalVar.MAX_SPEED);
System.out.println("MAx passagers for roodster: "+ finalVar.MODEL_X_PASSENGERS);
System.out.println(Integer.MAX_VALUE);
System.out.println("Company name: "+COMPANY_NAME);
System.out.println("Comapny name: "+FinalVariables.COMPANY_NAME);
System.out.println("Admin: "+ADMIN_USERNAME);

	}
}
