package ExceptionHandling;

public class Ex2 {
	

	public static int arr[]=new int[5];

	public static void div(int x,int y)

	{

	arr[0]=22;

	arr[1]=33;



	try

	 {

	 System.out.println("Division of "+x+" / "+y+" is "+(x/y));
	 try {
			arr[11]=77;
	 }

	catch(ArrayIndexOutOfBoundsException aioob)

	{

	aioob.printStackTrace();

	}

	}

	catch(ArithmeticException e)

	{

	System.err.println("Please enter non zero value "+e);

	}

	

	}

	public static void main(String[] args) {

	int x=22;

	int y=10;

	System.out.println("Welcome to Division Program");

	Ex2.div(x,y);

	System.out.println("Bye...");

	}

	
}
