package chap12;

public class StringEx4 {
	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println("main : " + str);
		str = change(str);
		System.out.println("change ÀÌÈÄ main :" + str);
	}

	private static String change(String s) {
		s+= "456";
		System.out.println(s);
		return s;
	}
	
		
}
