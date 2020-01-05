package chap3;

public class VarEx1 {

	public static void main(String[] args) {	//프로그램 시작지점
		//변수의 선언 및 초기화
		byte b2;	//변수의 선언. b2 저장공간 1바이트 메모리 할당
		b2= -22;	//변수의 초기화
		//바이트로 저장할 수 있는 값의 범위 -2^7 ~ 2^7 (-128~127)
		long l1 = 1993245329;
		int i2 = 1879;
		short s1 = -135;

		//변수값 내용을 화면을 출력하기
		//System.out.println : 화면에 값을 출력
		System.out.println("b1=" + b2);
		System.out.println("l1="+ l1);
		System.out.println("l2=" + i2);
		System.out.println("s1=" + s1);
		
		float f1 = 1.0f;
		double d1 = 1.0;
		
		System.out.println("f1="+f1);
		System.out.println("d1="+d1);
		

		//실수형 리터널 기본 자료형은 double 임
		//float 리터널로 표시하기 위해서는 접미사를 붙여야 한다.
		//F,f : float 리터널
		//D,d : double 리터널
		//L,l : long 리터널
		
	}

}
