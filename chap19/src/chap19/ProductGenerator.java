package chap19;

/*
 * ��뷮 �����͸� product.txt ���Ϸ� �����ϱ�
 */
import java.io.*;

public class ProductGenerator {
	public static void main(String[] args) {
		PrintStream ps = null;
		FileOutputStream fos = null;
		String[] cars = {"�ƹ���", "�׷���", "BMW", "Benz", "��Ƽ"};
		String[] remark = {"�����", "�Ⱦ��", "�׳��̿�"};
		int limit  = 0;
		int con = 0;
		try {
			fos = new FileOutputStream("product.txt");
			ps = new PrintStream(fos);
			while(limit ++<1000) {
				ps.print((int)(Math.random()*12)+1+",");	//1������ 12�������� �Ǹſ�
				con=(int)(Math.random()*3)+1;				//1~3������ ��. 1.���� , 2.�Ǹ�, 3.��ǰ
				ps.print((int)(Math.random()*3)+1 +",");
				ps.print(cars[(int)(Math.random()*5)] + ",");	//�ڵ��� �̸�
				ps.print((int)(Math.random()*5)+1 + ",");				//���� 1~5���� �Ǹż���
				if(con==3) {
					ps.print("");
					ps.print(remark[(int)(Math.random()*3)]);	//��ǰ����
				}
				ps.println();
			}
			System.out.println("���ϻ����Ϸ�");
			ps.flush(); ps.close(); fos.close();
		} catch(IOException e) {
			e.getStackTrace();
		}
	}
}
