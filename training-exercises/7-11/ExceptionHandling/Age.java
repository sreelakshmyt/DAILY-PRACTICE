package ExceptionHandling;

import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER AGE");
		int a=s.nextInt();
		if(a>=18) {
			System.out.println("Valid age");
		}
		else {
			try {
				throw new InvalidAgeException(a);
			}
			catch(InvalidAgeException iae) {
				System.out.println(iae);
			}
		}
	}

}
