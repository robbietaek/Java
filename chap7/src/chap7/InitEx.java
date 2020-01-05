package chap7;

public class InitEx {

	static int cv;
	int iv;
	InitEx(){
		System.out.println("생성자 호출");
	}
	
	static {
		cv = (int)(Math.random()*100);
		System.out.println("클래스 초기화 블럭 cv =" +cv);
	}
	
	{
		System.out.println("인스턴스 초기화 블럭. 생성자 보다 먼저 호출됨");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main 메서드 시작");
		System.out.println("main init1 객체 생성");
		InitEx init1 = new InitEx();
		System.out.println("main init2 객체 생성");
		InitEx init2 = new InitEx();
		

	}

}
