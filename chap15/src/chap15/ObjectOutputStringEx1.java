package chap15;

import java.io.*;

class Customer implements Serializable{
	private String name;
	private transient int age;
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}
	
}


public class ObjectOutputStringEx1 {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos=new FileOutputStream("object.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Customer c1 = new Customer("全辨悼", 20);
		Customer c2 = new Customer("辫获矮", 30);
		oos.writeObject(c1);
		oos.writeObject(c2);
		System.out.println("绊按1 : " + c1);
		System.out.println("绊按2 : " + c2);
	}
}
