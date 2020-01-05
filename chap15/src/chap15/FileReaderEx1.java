package chap15;

import java.io.*;

public class FileReaderEx1 {
	public static void main(String[] args) throws IOException {
		FileReader fis = new FileReader("src/chap15/InputStreamEx1.java");
		System.out.println("read() 메서드를 이용하여 읽기");
		int data = 0;
		while((data = fis.read()) != -1) {
			System.out.print((char)data);
		}
		
		fis = new FileReader("src/chap15/InputStreamEx1.java");
		System.out.println("read(char[] buf) 메서드를 이용하여 읽기");
		char[] buf = new char[1024];
		while((data = fis.read(buf)) != -1) {
			System.out.print(new String(buf,0,data));
		}
		
		fis = new FileReader("src/chap15/InputStreamEx1.java");
		System.out.println("read(char[] buf) 메서드를 이용하여 읽기");
		while((data = fis.read(buf,0,buf.length)) != -1) {
			System.out.print(new String(buf,0,data));
		}
		
		
		
		
	}
}
