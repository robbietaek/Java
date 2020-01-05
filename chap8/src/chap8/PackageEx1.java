package chap8;

import java.util.Date;

import chap8.packtest.Pack2;

class Pack1{
	void method() {
		System.out.println("chap8.Pack1.method() »£√‚µ ");
	}
}

public class PackageEx1 {

	public static void main(String[] args) {
		Pack1 p1 = new Pack1();
		p1.method();
		
		Pack2 p2 = new Pack2();
		p2.method();
		Date d = new Date();
	}

}
