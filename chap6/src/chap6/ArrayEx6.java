package chap6;

public class ArrayEx6 {

	public static void main(String[] args) {
		
		if(args.length == 0 ) {
			System.out.println("Ŀ�ǵ� ���ο� �Ķ���͸� �Է��ϼ���.");
			System.out.println("java chap6.ArrayEx6 ȫ�浿 ���");
			return;
		}
		for(int i=0;i<args.length;i++) {
			System.out.println("args["+i+"]"+ args[i]);
		}

	}

}
