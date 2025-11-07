package ExceptionHandling;

public class ex4main {
	public static void main(String[] args) {
		try {
		Ex4.div(4,0);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}



}
