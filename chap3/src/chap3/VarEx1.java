package chap3;

public class VarEx1 {

	public static void main(String[] args) {	//���α׷� ��������
		//������ ���� �� �ʱ�ȭ
		byte b2;	//������ ����. b2 ������� 1����Ʈ �޸� �Ҵ�
		b2= -22;	//������ �ʱ�ȭ
		//����Ʈ�� ������ �� �ִ� ���� ���� -2^7 ~ 2^7 (-128~127)
		long l1 = 1993245329;
		int i2 = 1879;
		short s1 = -135;

		//������ ������ ȭ���� ����ϱ�
		//System.out.println : ȭ�鿡 ���� ���
		System.out.println("b1=" + b2);
		System.out.println("l1="+ l1);
		System.out.println("l2=" + i2);
		System.out.println("s1=" + s1);
		
		float f1 = 1.0f;
		double d1 = 1.0;
		
		System.out.println("f1="+f1);
		System.out.println("d1="+d1);
		

		//�Ǽ��� ���ͳ� �⺻ �ڷ����� double ��
		//float ���ͳη� ǥ���ϱ� ���ؼ��� ���̻縦 �ٿ��� �Ѵ�.
		//F,f : float ���ͳ�
		//D,d : double ���ͳ�
		//L,l : long ���ͳ�
		
	}

}
