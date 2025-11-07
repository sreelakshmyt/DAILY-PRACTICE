package ExceptionHandling;

public class Ex1 {
public static void main(String[] args) {
	int x=22;
	int y=0;
	try {
		System.out.println("WELCOME TO DIVISION PROGRAM");
		System.out.println("Division of "+x+" /"+y+"is "+(x/y));
	}
 catch(Exception e)
	{
		System.out.println("PLEASE ENTER NON ZERO VALUE"+e);
	}
	System.out.println("BYE");
}
}
