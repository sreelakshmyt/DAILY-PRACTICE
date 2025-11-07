package ENCAPSULATION.TASK1;


	public class Main {
	    public static void main(String[] args) {
	        BankAccount account = new BankAccount("123456789", 1000.00);
	        account.deposit(500);
	        account.withdraw(200);
	        account.deposit(300);
	        account.withdraw(150);

	        double interest = account.calculateInterest(3.0);

	      
	        account.getTransactionHistory().forEach(System.out::println);
	        System.out.println("Final Balance: " + account.getBalance());
	        System.out.println("Interest Earned: " + interest);
	    }
	}


