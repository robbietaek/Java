package chap10;

class Outer2{
	private int outeriv = 10;
	private static int outercv = 20;
	class InstanceInner{
		int iiv = outeriv;
		int iiv2 = outercv;
	}
	
	static class StaticInner{
		int siv = new Outer2().outeriv;
		static int scv = outercv;
	}
	static StaticInner cv = new StaticInner();
	InstanceInner iv = new InstanceInner();
	static InstanceInner cv2 = new Outer2().new InstanceInner();
//	StaticInner iv2 = new StaticInner();
	
	void method(final int pv) {
		class LocalInner{
			int liv = outeriv;
			int liv2 = outercv;
			void method() {
				System.out.println("pv="+pv);
				System.out.println(liv+","+liv2);
				System.out.println(outeriv+","+outercv);
			}
		}
		LocalInner li = new LocalInner();
		li.method();
	}
}


public class InnerEx2 {

	public static void main(String[] args) {

		Outer2 out = new Outer2();
		out.method(1);
		Outer2.InstanceInner i2 = out.new InstanceInner();
		System.out.println(i2.iiv);
		System.out.println(i2.iiv2);
		Outer2.StaticInner i3 = new Outer2.StaticInner();
		System.out.println(i3.siv);
		System.out.println(Outer2.StaticInner.scv);
	}
}
