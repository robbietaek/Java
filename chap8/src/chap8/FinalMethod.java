package chap8;

public class FinalMethod {
	final void finalMethod() {
		System.out.println("finalMethod �������̵� �Ұ�");
	}

}

class SubMethod extends FinalMethod{
	void finalMethod() {
		System.out.println("finalMethod �������̵� �Ұ�");
	}
}