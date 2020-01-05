package chap15;

import java.io.*;

public class ObjectInputStreamEx1 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Object.ser"));
		Customer c1 = (Customer) ois.readObject();
		Customer d2 = (Customer) ois.readObject();
		System.out.println("°í°´1:" + c1);
		System.out.println("°í°´2:" + d2);
	}
}
