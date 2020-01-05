package chap6;

public class ArrayEx6 {

	public static void main(String[] args) {
		
		if(args.length == 0 ) {
			System.out.println("커맨드 라인에 파라미터를 입력하세요.");
			System.out.println("java chap6.ArrayEx6 홍길동 김삿갓");
			return;
		}
		for(int i=0;i<args.length;i++) {
			System.out.println("args["+i+"]"+ args[i]);
		}

	}

}
