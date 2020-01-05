package chap11;

import java.io.IOException;

class Parent{
	void method(int i) throws Exception{
		System.out.println(i);
	}
}

class Child extends Parent{
	@Override
	void method(int i) throws RuntimeException{
		System.out.println(i);
	try {
		throw new IOException();
	}catch(IOException e) {}
}
}

public class ExceptionEx9 {

}
