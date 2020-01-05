package chap10;

public class ExceptionEx2 {
	public static void main(String[] args) {

		try {
			System.out.println(args[0]);
			System.out.println(Integer.parseInt(args[0]));
			System.out.println(10 / Integer.parseInt(args[0]));
			String str = null;
			System.out.println(str.charAt(0));
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누지 마세요.");
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("command 라인에 파라미터를 입력하세요.");
		} catch (NumberFormatException e) {
			System.out.println("command 라인에 정수만 입력하세요");
		} catch (RuntimeException e) {
			System.out.println("RuntimeException 발생");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("오류발생 : 전산부로 전화요망 (119)");
		}
	}
}
