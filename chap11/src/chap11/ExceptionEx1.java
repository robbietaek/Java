package chap11;

public class ExceptionEx1 {
	public static void main(String[] args) {
		try {

			System.out.print(1/0);
			System.out.print(2);
			System.out.print(3);
			System.out.print(4);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누지 마세요.");
		}
		System.out.print(5);
	}
}
