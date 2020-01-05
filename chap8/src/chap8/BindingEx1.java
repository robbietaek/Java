package chap8;

//class Parent3{
//	int x = 10;
//	void method() {
//		System.out.println("Parent 메서드");
//	}
//}
//
//class Child3 extends Parent3{
//	int x = 20;
//	
////	@Override
//	void method() {
//		int x = 30;
//		System.out.println("Child 메서드");
//		System.out.println("x="+x);
//		System.out.println("this.x="+this.x);
//		System.out.println("super.x"+super.x);
//	}
//}

public class BindingEx1 {
	public static void main(String[] args) {

		Parent3 p = new Child3();
		System.out.println(p.x);
		p.method();
		Child3 c= new Child3();
		System.out.println(c.x);
		c.method();
		

	}

}
