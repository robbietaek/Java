package chap16;

import java.io.*;

public class ProcessEx1 {

	public static void main(String[] args) throws IOException {
		Process p = Runtime.getRuntime().exec("ping 192.168.0.1");	//Runtime.getRuntime() OS�κ��� ��������� �޾ƿ�
		Reader is = new InputStreamReader(p.getInputStream());
		int data = 0;
		while((data=is.read())!=-1) {
			System.out.print((char)data);
		}
	}

}
