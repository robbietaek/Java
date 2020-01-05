package chap12;

public class WrapperEx3 {
	public static void main(String[] args) {

		int is = Integer.parseInt("123");
		System.out.println(is);
		is = Integer.parseInt("123",8);
		System.out.println(is);
		is = Integer.parseInt("123",16);
		System.out.println(is);
		float f = Float.parseFloat("123.45");
		System.out.println(f);
		f = Float.parseFloat("123.45f");
		System.out.println(f);
		double d = Double.parseDouble("123.45");
		System.out.println(d);
		System.out.println(Integer.toBinaryString(999999999));
		System.out.println(Integer.toOctalString(999999999));
		System.out.println(Integer.toHexString(999999999));
		double d2 = 123.45;
		float f2 = 123.45f;
		int i2 = 123;
		long l2 = 123;
		short s2 = 123;
	}
}
