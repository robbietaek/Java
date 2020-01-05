package chap10;

public class ExceptionEx6 {
	public static void main(String[] args) throws Exception{
		try {
		throw new Exception("예외강제발생");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
