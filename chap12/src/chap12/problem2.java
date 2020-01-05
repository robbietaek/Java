package chap12;

public class problem2 {
	public static void main(String[] args) {
		System.out.println(round(3.1215,1));
		System.out.println(round(3.1215,2));
		System.out.println(round(3.1215,3));
		System.out.println(round(3.1215,4));
	}

	private static String round(double d, int i) {
		
		return String.format("%."+i+"f",d);
		
		
	}
}
