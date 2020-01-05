package chap8;

abstract class Abs1{
	int a= 10;
	abstract int getA();
}

abstract class Abs2 extends Abs1{
	int b = 20;
	abstract int getB();
}


class Normal extends Abs2{
	@Override
	int getB() {
		return b;
	}
	
	@Override
	int getA() {
		return a;
	}
	
}


public class AbstractEx1 {

	public static void main(String[] args) {
		Abs1 a1 = new Normal();
		System.out.println(a1.getA());
//		System.out.println(a1.getB());
		
		Abs2 a2 = (Abs2)a1;
		System.out.println(a2.getA());
		System.out.println(a2.getB());
		
		Normal n = (Normal)a2;
		System.out.println(n.getA());
		System.out.println(n.getB());
//		a2 = new Abs2();//error. 추상클래스는 객체화 불가
	}
}
