package chap10;

class Outer3{
	private int iv = 10;
	int iv2 = 20;
	class InstanceInner{
		int iv = 100;
		void method1() {
			int iv = 300;
			System.out.println("iv="+iv);
			System.out.println("this.iv="+this.iv);
			System.out.println("Outer3.this.iv="+Outer3.this.iv);
		}
	}
}

public class InnerEx3 {

	public static void main(String[] args) {
		Outer3 out = new Outer3();
		Outer3.InstanceInner li = out.new InstanceInner();
		li.method1();

	}

}
