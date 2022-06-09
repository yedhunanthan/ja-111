package p1;

public class Account {

	String accountNumber; 
	double Balance;
	
	public Account(String x) {
		this.accountNumber = x;
		this.Balance = 0;
	}
	public void deposit(double amount) {
		Balance += amount;
	}
	public double withdraw(double amount) throws InsufficientFundsException {
		if(Balance > amount) {
			Balance -= amount;
			return Balance;
		}
		else {
			InsufficientFundsException in = new InsufficientFundsException("insufficient balance");
			throw in;
		}
	}
}
