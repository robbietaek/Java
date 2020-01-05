package chap15;

import java.io.*;

public class FileOutputStreamEx2 {
	public static void main(String[] args) {
		firstmethod();
	}

	private static void firstmethod() {
		secondMethod();
	}

	private static void secondMethod() {
		try {
			throw new Exception("���� ���� �޽��� �����ϱ�");
		} catch (Exception e) {
			e.printStackTrace(); //ǥ�ؿ�����ü�� �޽��� ���.
			try {
				/*
				 * ("error.log",true)
				 * "error.log" : ������ ������ �̸�. ���� ������ ����, ������ ������ ���뺯��
				 * true /false : true : ������ �ִ� ��� ������ ���뿡 ���ο� ������ �߰�
				 * 				false : ���� ���ִ� ��� ������ ������ ���ο� �������� ����
				 */
				FileOutputStream fos = new FileOutputStream("error.log",true);
				fos.write(e.getMessage().getBytes());
				e.printStackTrace(new PrintStream(fos)); //error.log ���Ͽ� e.printStackTrace() ������ ���
				fos.write("====================\n\n.".getBytes());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
