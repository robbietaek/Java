package chap8;

public class FinalMethod {
	final void finalMethod() {
		System.out.println("finalMethod 오버라이딩 불가");
	}

}

class SubMethod extends FinalMethod{
	void finalMethod() {
		System.out.println("finalMethod 오버라이딩 불가");
	}
}