package chap17;

import java.io.*;
import java.net.*;

public class SimpleWebServerEx1 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(7777);
			while (true) {
				System.out.println("클라이언트 접속대기");
				Socket client = server.accept();
				System.out.println("쓰레드생성");
				HttpThread ht = new HttpThread(client);
				ht.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static class HttpThread extends Thread {
		private Socket client;
		BufferedReader br;
		OutputStream pw;

		HttpThread(Socket client) {
			this.client = client;
			try {
				br = new BufferedReader(new InputStreamReader(client.getInputStream()));
				pw = client.getOutputStream();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			FileInputStream fbr = null;
			try {
				// GET / HTTP/1.1

				String line = br.readLine();
				System.out.println("Http Header : " + line);
				int start = line.indexOf("/") + 1;
				int end = line.lastIndexOf("HTTP") - 1;
				String fileName = line.substring(start, end);
				if (fileName.equals("")) {
					fileName = "index.html";
				}
				System.out.println("사용자 요청 파일 : " + fileName);
				fbr = new FileInputStream(fileName);
				int fileLine = 0;
				byte[] buff = new byte[1024];
				while ((fileLine = fbr.read(buff)) != -1) {
					pw.write(buff,0,fileLine);
					pw.flush();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (fbr != null)
						fbr.close();
					if (br != null)
						br.close();
					if (pw != null)
						pw.close();
					if (client != null)
						client.close();
				} catch (IOException e) {
				}
			}
		}
	}

}
