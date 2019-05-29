package day_41_;

public class BankAccount {
double balance;
String accountHolder;
int accountNum;
public void deposit(double amount) {
	System.out.println("Depositing $"+amount+" to "+accountNum);
	balance+=amount;
	
}
public void withdraw(int amount) {
	System.out.println("Withdrawing $"+ amount+" from "+accountNum);
	balance-=amount;
	if(balance<0) {
		balance-=35;
	}
}
public void showBalance() {
	System.out.println("accountHolder: "+accountHolder+", Account Number: "+accountNum+", your balance is "+balance);
}
public void charge(double price) {
	balance-=price;
	if(balance>=price) {
		System.out.println("You will be charge in couple sec... "+price+" your amount is "+balance);
	}else {
		System.out.println("Sorry, your balance is negative");
	}	
}
}
