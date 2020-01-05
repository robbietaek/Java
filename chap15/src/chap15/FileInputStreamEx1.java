package chap15;

import java.io.*;

public class FileInputStreamEx1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/chap15/InputStreamEx1.java");
		System.out.println("read() 메서드를 이용하여 읽기");
		int data =0;
		while((data=fis.read()) != -1) {
			System.out.print((char)data);
		}
		
		
		System.out.println("read(byte[] buf) 메서드를 이용하여 읽기");
		fis = new FileInputStream("src/chap15/InputStreamEx1.java");
		byte[] buf = new byte[fis.available()];
		while((data=fis.read(buf)) != -1) {
			System.out.println(new String(buf,0,data));
		}
		
		System.out.println("read() 메서드를 이용하여 읽기");
		fis = new FileInputStream("src/chap15/InputStreamEx1.java");
		buf = new byte[fis.available()];
		while((data=fis.read(buf,0,buf.length)) != -1) {
			System.out.print(new String(buf,0,data));
		}	
		
	}

}
