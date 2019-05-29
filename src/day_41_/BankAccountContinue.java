package day_41_;

public class BankAccountContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount atm= new BankAccount();
		atm.accountHolder="Bill Gates";
		atm.accountNum=12345;
		atm.deposit(1562.35);
		atm.withdraw(100);
		atm.showBalance();
		atm.charge(300);
	}

}
