package chap10;

public class ExceptionEx5 {
	public static void main(String[] args) {
		try {
		first();
		} catch (Exception e) {
			System.out.println("���ڸ� �����մϴ�.");
			e.printStackTrace();
		}
	}

	private static void first() {
		System.out.println("first �޼���");
		second();
	}

	private static void second() {
		System.out.println("second �޼���");
		System.out.println(Integer.parseInt("abc"));
	}
}
