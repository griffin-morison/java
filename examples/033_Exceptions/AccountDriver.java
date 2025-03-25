public class AccountDriver {

	public static void main(String[] args) {

		// Create new Account object
		Account myAccount = null;
		try {
			// Initial deposit 100
			myAccount = new Account(100);
			// Deposit method pass
			myAccount.deposit(10);
			// Withdraw method
			myAccount.withdraw(200);
		} 
		// Catch NonPositiveException
		catch (NonPositiveNumberException e) {
			System.out.println(e.getMessage());
		} 
		// Catch InsufficientFundsException
		catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
		// Print Account balance
		System.out.println(myAccount.getBalance());
	}

}
