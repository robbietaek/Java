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
			System.out.println("0���� ������ ������.");
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("command ���ο� �Ķ���͸� �Է��ϼ���.");
		} catch (NumberFormatException e) {
			System.out.println("command ���ο� ������ �Է��ϼ���");
		} catch (RuntimeException e) {
			System.out.println("RuntimeException �߻�");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("�����߻� : ����η� ��ȭ��� (119)");
		}
	}
}
