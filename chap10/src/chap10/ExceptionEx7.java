package chap10;

public class ExceptionEx7 {
	public static void main(String[] args) {
		try {
		badmethod();
		} catch(Exception e) {
			System.out.println("main���� ���� ó��");
			e.printStackTrace();
		}
	}

	private static void badmethod() throws Exception{
		try {
		throw new Exception("���ܰ����߻�");
		} catch(Exception e) {
			System.out.println("bad ���� ����ó��");
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
//		throw new Exception("���ܰ����߻�");
//	}
//}
