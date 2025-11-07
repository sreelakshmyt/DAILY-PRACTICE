package ExceptionHandling;

public class Bank{
int balance;

 public Bank(int balance) {

	this.balance = balance;
}

 void withdraw(int amt) throws Exception {

	// TODO Auto-generated method stub
	if(amt>this.balance) {
		throw new Exception("INSUFFICIENT ACCOUNT BALANCE");
		
	}
	else {
		balance-=amt;

	}
 }
	void display() throws Exception{
		if(this.balance<0) {
			throw new Exception("INVALID BALANCE");
		}
		else {
			System.out.println(this.balance);
		}
	}
	public static void main(String[] args) {
		Bank b =new Bank(100);
		try {
		b.withdraw(10);
		b.display();
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("bye");
		}
		
	}

}

