package chap10;

public class ExceptionEx6 {
	public static void main(String[] args) throws Exception{
		try {
		throw new Exception("���ܰ����߻�");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
