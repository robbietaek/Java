package chap18;

interface LambdaInterface4 {
	int method(int x, int y);
}

public class LambdaEx4 {
	public static void main(String[] args) {

		LambdaInterface4 f4 = (x, y) -> {
			return x * y;
		};

		System.out.println("두수의 곱 : " + f4.method(2, 5));
		f4 =(x,y) -> x+y;
		System.out.println("두수의 더하기 : " + f4.method(2, 5));
		f4 =(x,y) -> x/y;
		System.out.println("두수의 몫 : " + f4.method(5, 2));
		f4 =(x,y) -> x%y;
		System.out.println("두수의 나누기 : " + f4.method(5, 2));
		f4 =(x,y) -> sum(x,y);
		System.out.println("두수의 더하기 : " + f4.method(2, 5));
		
		f4 = (x,y) -> (x>y)?x:y;
		System.out.println("큰 수는 : " + f4.method(2, 5));
		
		f4 = (x,y) -> (x<y)?x:y;
		System.out.println("작은 수는 : " + f4.method(2, 5));
	}
		
	static int sum(int x, int y) {
		return x+y;
	}
}
