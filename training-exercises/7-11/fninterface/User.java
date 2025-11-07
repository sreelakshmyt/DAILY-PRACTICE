package fninterface;

public class User{
	public static void main(String[] args) {
		Animal a=(x)->{System.out.println("Animal eats"+x+"Kg meat per day");};
		a.eat(5);
		}
}

	
