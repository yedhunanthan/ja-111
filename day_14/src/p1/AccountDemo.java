package p1;

public class AccountDemo {

	public static void main(String[] args) {
		
		Account a1 = new Account("qw123");
		a1.deposit(100);
		try {
			double b = a1.withdraw(10);
			System.out.println(b);
		} catch (InsufficientFundsException e1) {
			e1.printStackTrace();
		}
		
		Account a2 = new Account("qw1234");
		a2.deposit(100);
		try {
			double c = a1.withdraw(200);
			System.out.println(c);
		} catch (InsufficientFundsException e3) {
			e3.printStackTrace();
		}
	}
}
