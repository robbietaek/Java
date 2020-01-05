package chap15;

import java.io.*;

public class problem4 {
	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("bin/chap15/PrintStreamEx1.class");

		byte[] buff = new byte[1];
		int data = 0;

		while ((data = fis.read(buff)) != -1) {
			for (int i = 0; i < data; i++) {
				System.out.printf("%02X ", buff[i]);
			}
			System.out.println();
		}

	}
}
