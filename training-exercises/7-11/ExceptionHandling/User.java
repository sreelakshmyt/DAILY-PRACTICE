package ExceptionHandling;

import java.io.DataInputStream;
import java.io.IOException;

public class User {
//	public static void main(String[] args) throws IOException {
//		DataInputStream dis=new DataInputStream(System.in);
//		System.out.println("Enter your name");
//		String name="";
//		name=dis.readLine();
//	}
	public static void main(String[] args)  {
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter your name");
		String name="";
		try {
			name=dis.readLine();
			System.out.println(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
