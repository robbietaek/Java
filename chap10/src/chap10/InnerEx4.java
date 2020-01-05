package chap10;

interface I { 
	void test();
}

abstract class Abs{
	abstract void test();
}

public class InnerEx4 {
	public static void main(String[] args) {
		I i = new I() {
			int iv = 100;
			@Override
			public void test() {
				System.out.println("iv="+iv);
				System.out.println("������ Ŭ���� test �޼���");
			}
		};
		i.test();
//		System.out.println(i.iv);
		
		int iv = 200;
		iv++;
		Abs a = new Abs() {
			public void test() {
				System.out.println("iv="+iv);
				System.out.println("Abs ����Ŭ������ test �޼���");
			}
		};
		a.test();
		
	}

}
