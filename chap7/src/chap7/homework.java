package chap7;

/*
 * 3. Coin Ŭ������ ���� Ŭ���� �����ϱ�

  Coin Ŭ����
   ������� : int side (�ո�:0, �޸�:1), serialNo(������ȣ), sno(������ȣ ���������� Ŭ��������)
   ����޼��� : void flip()
                Math.random() �޼��带 ����Ͽ� side�� ����.

  ����Ŭ����
    Coin Ŭ������ ��ü�� 10�� �����ϱ�.
    ��ü������, ������ȣ�� �Է��ϰ�, flip() �޼��带 �̿��Ͽ� ������ ������ �ո����� �޸�����
    ���θ� ����ϱ�

  [���]
1������ : �ո�
2������ : �޸�
  ....

��ü �ո� ������ ���� :
��ü �޸� ������ ���� :
 * 
 */

class Coin{
	int side;
	int serialNo;
	static int sno;
	void flip() {
		side = (int)(Math.random()*2);
	}
}




public class homework {
	public static void main(String[] args) {

		Coin c[] = new Coin[10];
		
		int front = 0;
		int back = 0;
		
		for(int i=0;i<10;i++) {
			c[i] = new Coin();
			c[i].serialNo = Coin.sno++;
			c[i].flip();
			if(c[i].side==0) {
				System.out.println(i+"�� ������ �ո�");
				front++;
				
			}
			else {
				System.out.println(i+"�� ������ �޸�");
				back++;
			}
		}
		System.out.println("�ո���"+front+"��");
		System.out.println("�ո���"+back+"��");	
		
	}
}
