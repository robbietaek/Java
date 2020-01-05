package chap3;

public class VarEx2 {

	public static void main(String[] args) {
		
		String s = "abc";
//		s = 'a';
		
		byte b1 = 120;
		int i1 = b1;
		byte b2 = (byte)b1;
		System.out.println("b2="+b2);
		byte b3 = (byte)256;
		System.out.println("b3="+b3);
		
		long l1 = 10;
		float f1 = l1;
		long l2 = (long)f1;
		char c1 = 'a';
		short s1= (short)c1;
		char c2 = (char)b1;
		
		int i2 = (int)(i1 + l1);
		
		System.out.println("¹øÈ£"+1+2+3);
		System.out.println(1+2+3 + "¹ø");
		
		char c3 = 'A';
		int i3 = c3;
		System.out.println("c3=" + c3 + ",i3=" + i3);

		byte b4;
		byte b5=1;
		byte b6=2;
		b4 = (byte)(b5+b6);
	}

}
