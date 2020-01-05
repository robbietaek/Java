package chap15;

import java.io.*;

public class ObjectInputStreamEx2 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object2.ser"));
		User u1 = (User)ois.readObject();
		User u2 = (User)ois.readObject();
		System.out.println("사용자 : "+ u1);
		System.out.println("사용자 : "+ u2);
	}
}

