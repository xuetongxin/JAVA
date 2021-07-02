package tools;

import java.util.Date;
public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account aAccount=new Account(Integer.valueOf(args[0]),Double.valueOf(args[1]));
		aAccount.setBalance(aAccount.getBalance()+10000);
		aAccount.deposit(Double.valueOf(args[2]));
		aAccount.withdraw(Double.valueOf(args[3]));
		System.out.println("The balance = "+aAccount.getBalance());
	}

}
class Account {
	private int id ; private double balance;
	double annulInterestRate;
	int date;
	
	Account(){
		
	}
	
	Account(int id , double balance){
		this.id = id;
		this.balance = balance;
	}
	
	int getId() {
		return id;
	}
	
	void setId(int a) {
		this.id = a;
	}
	
	double getBalance() {
		return balance;
	}
	
	void setBalance(double b) {
		this.balance = b;
	}
	
	double getAnnulInterestRate() {
		return balance;
	}
	
	void setAnnulInterestRate(double c) {
		this.annulInterestRate = c;
	}
	
	int getDateCreated() {
		return date;
	}
	
	double getMonthlyInterestRate() {
		return annulInterestRate/12.0 ;
	}
	
	void withdraw(double amount) {
		balance -= amount;
	}
	
	void deposit(double amount) {
		balance += amount;
	}
	
}