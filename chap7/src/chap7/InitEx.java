package chap7;

public class InitEx {

	static int cv;
	int iv;
	InitEx(){
		System.out.println("������ ȣ��");
	}
	
	static {
		cv = (int)(Math.random()*100);
		System.out.println("Ŭ���� �ʱ�ȭ �� cv =" +cv);
	}
	
	{
		System.out.println("�ν��Ͻ� �ʱ�ȭ ��. ������ ���� ���� ȣ���");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main �޼��� ����");
		System.out.println("main init1 ��ü ����");
		InitEx init1 = new InitEx();
		System.out.println("main init2 ��ü ����");
		InitEx init2 = new InitEx();
		

	}

}
