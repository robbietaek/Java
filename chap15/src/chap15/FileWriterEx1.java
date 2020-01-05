package chap15;

/*
 * void write(int data) : data 중 1 바이트만 파일로 출력
 * void write(byte[] buf) : buf의 내용을 파일로 출력
 * void write(byte[] buf,int start,int len) : buf의 내용을 파일로 출력
 * void write(string) 가능
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
		fos.write('가');
		fos.write('나');
		fos.write('다');
		//getBytes()  : 문자열을 byte로 리턴
		char[] buf = "\n반갑습니다. FileOutputStream예제입니다.\n".toCharArray();
		fos.write(buf);
		fos.write(buf,1,6);
		fos.write("안녕하세요.");
		fos.flush();
	}
}
