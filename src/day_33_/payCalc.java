package day_33_;

public class payCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getHourlyPay(0,86));
	}
public static double getHourlyPay(int hours, int rate) {
	double total=hours*rate;
	if(hours<0 || hours==0) {
		System.out.println("Invalid hours!");
		return 0;
		
	}
	if(rate==0 || rate<0) {
		System.out.println("Invalid rate!");
		return 0;
	}
	
	return total;
	
}
}
