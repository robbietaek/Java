package chap11;

class MyException1 extends RuntimeException{
	MyException1(String msg){
		super(msg);
	}
}


public class problem3{

	public static void main(String[] args) {
		method();
	
	}
	
	private static void method()  {
		throw new MyException1("Exam3.method() 예외 강제 발생");
	}

}
