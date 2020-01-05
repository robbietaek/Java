package chap11;
/*
 * UnsupportFunctionException Ŭ���� �����ϱ�
 * 1.������� : private final int ERR_CODE;
 * 2.��� �޼���:
 * public int getErrCode(); : ERR_CODE �� ��ȯ
 * public String getMessage() : �������̵� �޼���.
 * 		�θ�Ŭ������ message ���� ERR_CODE �� ��ȯ.
 * 3. ����ó���� ���ص� �ǵ��� ����.
 */

class UnsupportFunctionException extends RuntimeException {

	private final int ERROR_CODE;
//	String msg = "";

	UnsupportFunctionException(String msg, int ERROR_CODE) {
		super(msg);
//		this.msg = msg;
		this.ERROR_CODE = ERROR_CODE;
	}

	public int getErrorcode() {
		return ERROR_CODE;
	}

	public String getMessage() {
		return super.getMessage() + ERROR_CODE;
	}
}

public class problem4 {

	public static void main(String[] args) {
		try {
		throw new UnsupportFunctionException("�������� �ʴ� ����Դϴ�.", 100);
		} catch(UnsupportFunctionException e) {
			System.out.println(e.getMessage());
		}
	}
}
