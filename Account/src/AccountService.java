
public class AccountService {

	private static final double EFT_CHARGE = 3;
	
	public void withdraw(Account account, double amount){
		double balance = account.getBalance();
		if (balance >= amount) {
			balance -= amount;
			account.setBalance(balance);
		}  else {
			System.out.println("withdraw error");
		}
	}
	
	public void deposit(Account account, double amount) {
		double balance = account.getBalance();
		balance += amount;
		account.setBalance(balance);
	}
	
	public void eft(Account sourceAccount, Account targetAccount, double amount) {
		withdraw(sourceAccount, amount);
		withdraw(sourceAccount, EFT_CHARGE);
		deposit(targetAccount, amount);
	}
}
