package chap15;

/*
 * void write(int data) : data 중 1 바이트만 파일로 출력
 * void write(byte[] buf) : buf의 내용을 파일로 출력
 */



import java.io.*;

public class FileOutputStreamEx1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("out.txt");
		fos.write('1');
		fos.write('2');
		fos.write('3');
		fos.write('a');
		fos.write('b');
		fos.write('c');
		fos.write('가');
		fos.write('나');
		fos.write('다');
		byte[] buf = "\n반갑습니다. FileOutputStream예제입니다.\n".getBytes();
		fos.write(buf);
		fos.write(buf,1,6);
		fos.flush();
	}
}
