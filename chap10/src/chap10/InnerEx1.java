package chap10;

class Outer1{
	class InstanceInner{	//인스턴스 내부 클래스
		int iv = 100;
//		static int cv = 10;
		final static int MAX = 200;
	}
	
	static class StaticInner{
		int iv = 300;
		static int cv = 400;
		final static int MAX = 500;
	}
	
	void method() {
		class LocalInner{
			int iv = 600;
//			static int cv = 700;
			final static int MAX = 700;
		}
		LocalInner lc = new LocalInner();
		System.out.println(lc.iv);
		System.out.println(LocalInner.MAX);
	}
	
	void method2() {
//		LocalInner lc = new LocalInner();
	}
}

public class InnerEx1 {

	public static void main(String[] args) {
		Outer1.StaticInner si = new Outer1.StaticInner();
		System.out.println(si.iv);
		System.out.println(Outer1.StaticInner.cv);
		System.out.println(Outer1.StaticInner.MAX);
		Outer1.InstanceInner ii = new Outer1().new InstanceInner();
		Outer1 outer = new Outer1();
		Outer1.InstanceInner ii2 = outer.new InstanceInner();
		System.out.println(ii2.iv);
		System.out.println(Outer1.InstanceInner.MAX);
		outer.method();

	}

}
