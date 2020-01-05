package chap15;

import java.io.*;

public class InputStreamEx1 {
	public static void main(String[] args) throws IOException {
//		InputStream in = System.in;
		Reader in = new InputStreamReader(System.in);
		int data = 0;
		while((data=in.read()) != -1) {
			System.out.print((char)data);
		}
		//f가나다라마바사아자차가카
	}
}
