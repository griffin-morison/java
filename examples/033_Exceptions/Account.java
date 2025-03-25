public class Account {
	private double balance;

	// Default constructor
	public Account() {
		balance = 0;
	}

	// Parameterized constructor
	public Account(double initialDeposit) throws NonPositiveNumberException {
		// If initialDeposit is less than or equal to zero
		if (initialDeposit <= 0) {
			// Throw NonPositiveNumberException
			throw new NonPositiveNumberException("Initial deposit must be a positive amount.");
		}
		// Set balance to initialDeposit
		balance = initialDeposit;
	}

	// Get balance method
	public double getBalance() {
		return balance;
	}

	// Deposit method
	public void deposit(double amount) throws NonPositiveNumberException {
		// If amount is less than or equal to zero
		if (amount <= 0) {
			// Throw NonPositiveNumberException
			throw new NonPositiveNumberException("Deposit must be greater than zero.");
		}
		// Update balance
		balance += amount;
	}

	// Withdraw method
	public void withdraw(double amount)
			throws NonPositiveNumberException, InsufficientFundsException {
		// If amount is less than or equal to zero
		if (amount <= 0) {
			{
				// Throw NonPositiveNumberException
				throw new NonPositiveNumberException("Withdraw must be greater than zero.");
			}
		}
		// If amount is greater than balance
		if (amount > balance) {
			// Throw InsufficientFundsException
			throw new InsufficientFundsException("Withdraw is too large!");
		}

		// Update balance
		balance -= amount;
	}

}
