package chap8;


import chap8.packtest.Modifier2;

class Modifier{
	private int v1 = 100;
			int v2 = 200;
			int v3 = v1;
	public void method() {
		System.out.println("chap8.Modifier.method() 메서드임");
		System.out.println("v1 = "+v1);
		System.out.println("v2 = "+v2);
	}
}


class Modifier3 extends Modifier2{
	public void method() {
//		System.out.println("v1="+v1);
//		System.out.println("v2="+v2);
		System.out.println("v3="+v3);
		System.out.println("v4="+v4);
		
	}
}



public class ModifierEx1 {

	public static void main(String[] args) {

		Modifier m1 = new Modifier();
		System.out.println(m1.v1);
		System.out.println(m1.v2);
		m1.method();
		Modifier3 m3 = new Modifier3();
		System.out.println(m3.v1);
		System.out.println(m3.v2);
		System.out.println(m3.v3);
		System.out.println(m3.v4);
		
	}

}
