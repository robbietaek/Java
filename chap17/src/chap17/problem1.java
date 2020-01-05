package chap17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class Multi extends Thread {

	private Socket client;
	PrintWriter out;
	BufferedReader br;

	Multi(Socket client) {
		this.client = client;
		System.out.println("connected ip" + client.getInetAddress());
		System.out.println("connected port : " + client.getPort());
		try {
			out = new PrintWriter(client.getOutputStream(), true);
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		String input;
		try {
			while ((input = br.readLine()) != null) {
				out.println(input);
				out.flush();
				System.out.println("client data : " + input);
			}
			br.close();
			out.close();
			client.close();
		} catch (IOException e) {
			e.getStackTrace();
		}
	}
}

public class problem1 {

	public static void main(String[] args) {

		try {
			ServerSocket server = new ServerSocket(5000);
			while (true) {
				System.out.println("클라이언트 접속대기");
				Socket client = server.accept();
				System.out.println("쓰레드생성");
				Thread m = new Multi(client);
				m.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
