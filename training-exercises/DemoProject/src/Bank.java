
public class Bank {
	int amount=2000;
	void balance() {
		System.out.println("Account balance is"+amount);
		}
	
	void withdraw(int amount) {
		if(this.amount<amount) {
			System.out.println("insufficient balance");}
		else {
		this.amount=this.amount-amount;
		System.out.println();
		}
	}
	void deposit(int amount) {
		this.amount=this.amount+amount;
		
	}
	public static void main(String[] args) {
		Bank b1=new Bank();
		b1.balance();
		b1.withdraw(50);
		b1.balance();
		b1.deposit(10000);
		b1.balance();
	}

}
