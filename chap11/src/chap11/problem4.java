package chap11;
/*
 * UnsupportFunctionException 클래스 구현하기
 * 1.멤버변수 : private final int ERR_CODE;
 * 2.멤버 메서드:
 * public int getErrCode(); : ERR_CODE 값 반환
 * public String getMessage() : 오버라이딩 메서드.
 * 		부모클래스의 message 값과 ERR_CODE 값 반환.
 * 3. 예외처리를 안해도 되도록 구현.
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
		throw new UnsupportFunctionException("지원하지 않는 기능입니다.", 100);
		} catch(UnsupportFunctionException e) {
			System.out.println(e.getMessage());
		}
	}
}
