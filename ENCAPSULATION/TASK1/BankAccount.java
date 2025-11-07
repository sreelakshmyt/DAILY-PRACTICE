package ENCAPSULATION.TASK1;

	import java.util.ArrayList;
	import java.util.List;

	public class BankAccount {
	    private String accountNumber;
	    private double balance;
	    private List<String> transactionHistory;

	   
	    public BankAccount(String accountNumber, double initialBalance) {
	        this.accountNumber = accountNumber;
	        this.balance = Math.max(initialBalance, 0); 
	        this.transactionHistory = new ArrayList<>();
	        transactionHistory.add("Account created with balance: " + balance);
	    }

	    public String getAccountNumber() {
	        return accountNumber;
	    }

	    public void setAccountNumber(String accountNumber) {
	        this.accountNumber = accountNumber;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void setBalance(double balance) {
	        this.balance = Math.max(balance, 0);
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            transactionHistory.add("Deposited: " + amount);
	        }
	    }

	    public void withdraw(double amount) {
	        double fee = 2.00;
	        if (amount + fee <= balance) {
	            balance -= (amount + fee);
	            transactionHistory.add("Withdrew: " + amount + " (Fee: " + fee + ")");
	        }
	    }

	    public double calculateInterest(double rate) {
	        return balance * rate / 100;
	    }

	    public List<String> getTransactionHistory() {
	        return transactionHistory;
	    }
	

}
