package chap9;

interface MyInterface1{
	void method();
	default void method1() {
		System.out.println("MyInterface1의 디폴트 메서드 : method1()");
	}
	static void staticmethod() {
		System.out.println("MyInterface1의 static 메서드 : method2()");
	}
}

interface MyInterface2{
	void method();
	default void method1() {
		System.out.println("MyInterface2의 디폴트 메서드 : method1()");
	}
	static void staticmethod() {
		System.out.println("MyInterface2의 static 메서드 : method2()");
	}
}


class Parent{
	public void method2() {
		System.out.println("Parent 클래스 멤버 메서드 : method2()");
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
	System.out.println("Child 클래스의 Method()");
	System.out.println("MyInterface1, MyInterface2 인터페이스의 추상메서드 method 오버라이딩함");
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
