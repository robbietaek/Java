package chap10;

public class ExceptionEx7 {
	public static void main(String[] args) {
		try {
		badmethod();
		} catch(Exception e) {
			System.out.println("main에서 예외 처리");
			e.printStackTrace();
		}
	}

	private static void badmethod() throws Exception{
		try {
		throw new Exception("예외강제발생");
		} catch(Exception e) {
			System.out.println("bad 에서 예외처리");
			e.printStackTrace();
			throw e;
		}
	}
}


//public class ExceptionEx7 { 
//	public static void main(String[] args) throws Exception	{
//		badmethod();
//	}
//
//	private static void badmethod() throws Exception
//	{
//
//		throw new Exception("예외강제발생");
//	}
//}
