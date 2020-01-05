package chap15;

/*
 * void write(int data) : data �� 1 ����Ʈ�� ���Ϸ� ���
 * void write(byte[] buf) : buf�� ������ ���Ϸ� ���
 * void write(byte[] buf,int start,int len) : buf�� ������ ���Ϸ� ���
 * void write(string) ����
 */



import java.io.*;

public class FileWriterEx1 {

	public static void main(String[] args) throws IOException {
		FileWriter fos = new FileWriter("out2.txt");
		fos.write('1');
		fos.write('2');
		fos.write('3');
		fos.write('a');
		fos.write('b');
		fos.write('c');
		fos.write('��');
		fos.write('��');
		fos.write('��');
		//getBytes()  : ���ڿ��� byte�� ����
		char[] buf = "\n�ݰ����ϴ�. FileOutputStream�����Դϴ�.\n".toCharArray();
		fos.write(buf);
		fos.write(buf,1,6);
		fos.write("�ȳ��ϼ���.");
		fos.flush();
	}
}
