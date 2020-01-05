package chap9;

interface MyInterface1{
	void method();
	default void method1() {
		System.out.println("MyInterface1�� ����Ʈ �޼��� : method1()");
	}
	static void staticmethod() {
		System.out.println("MyInterface1�� static �޼��� : method2()");
	}
}

interface MyInterface2{
	void method();
	default void method1() {
		System.out.println("MyInterface2�� ����Ʈ �޼��� : method1()");
	}
	static void staticmethod() {
		System.out.println("MyInterface2�� static �޼��� : method2()");
	}
}


class Parent{
	public void method2() {
		System.out.println("Parent Ŭ���� ��� �޼��� : method2()");
	}
}

class Child extends Parent implements MyInterface1,MyInterface2{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		MyInterface1.super.method1();
	}

	@Override
	public void method() {
	System.out.println("Child Ŭ������ Method()");
	System.out.println("MyInterface1, MyInterface2 �������̽��� �߻�޼��� method �������̵���");
	}
	
}

public class DefaultInterfaceEx1 {

	public static void main(String[] args) {

		Child c = new Child();
		c.method1();
		c.method2();
		MyInterface1.staticmethod();
	}

}
